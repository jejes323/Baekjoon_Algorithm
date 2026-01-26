import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    public static int check(int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == target) return 1;
            else if(arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        arr = new int[a];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        int b = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < b; i++) {
            int x = Integer.parseInt(st.nextToken());
            sb.append(check(x)).append('\n');
        }
        System.out.println(sb);
    }
}