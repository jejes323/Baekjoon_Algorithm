import java.io.*;
import java.util.*;

public class Main {
    public static boolean check(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == target) return true;
            else if(arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int tcase1 = Integer.parseInt(br.readLine());
        int[] arr1 = new int[tcase1];
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < tcase1; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        
        int tcase2 = Integer.parseInt(br.readLine());
        int[] arr2 = new int[tcase2];
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < tcase2; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr1);
        
        StringBuilder sb = new StringBuilder();
        for(int x : arr2) {
            if(check(arr1, x)) sb.append(1).append('\n');
            else sb.append(0).append('\n');
        }
        
        System.out.print(sb);
        
    }
}