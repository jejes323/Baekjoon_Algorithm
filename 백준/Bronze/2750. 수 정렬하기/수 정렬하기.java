import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        int[] arr = new int[tcase];
        
        for(int i = 0; i < tcase; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
        }
        
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tcase; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.print(sb);
    }
}