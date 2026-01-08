import java.io.*;
import java.util.*;

public class Main {
    
    public static int lower(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        
        while(left < right) {
            int mid = (left + right) / 2;
            if(arr[mid] >= target) right = mid;
            else left = mid + 1;
        }
        
        return left;
    }
    
    public static int upper(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        
        while(left < right) {
            int mid = (left + right) / 2;
            if(arr[mid] > target) right = mid;
            else left = mid + 1;
            
        }
        
        return left;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n1; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        
        int n2 = Integer.parseInt(br.readLine());
        int[] arr2 = new int[n2];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n2; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr1);
        
        StringBuilder sb = new StringBuilder();
        for(int x : arr2) {
            sb.append(upper(arr1, x) - lower(arr1, x)).append(" ");
        }
        System.out.print(sb);
    }
}