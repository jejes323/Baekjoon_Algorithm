import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int tcase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[tcase];
        
        for(int i = 0; i < tcase; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        } 
        
        Arrays.sort(arr);
        
        
        int sum = 0;
        int result = 0;
        for(int i = 0; i < tcase; i++) {
            sum += arr[i];
            result += sum;
        }
        
        System.out.println(result);
    }
}