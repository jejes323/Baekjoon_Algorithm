import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        int[] arr = new int[tcase];
        
        for(int i = 0; i < tcase; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        double a = tcase * 0.15;
        int b = (int) Math.round(a);
        
        
        int sum = 0;
        for(int i = b; i < tcase - b; i++) {
            sum += arr[i];
        }
        double result = sum / (double) (tcase - b*2);
        System.out.print((int) Math.round(result));
    }
}