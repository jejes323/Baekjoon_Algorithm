import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[100][100];
        
        int count = 0;
        int tcase = Integer.parseInt(br.readLine());
        for(int i = 0; i < tcase; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int j = a - 1; j < a + 9; j++) {
                for(int k = b - 1; k < b + 9; k++) {
                    arr[j][k] += 1;
                }
            }
        }
        
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(arr[i][j] > 0) count++;
            }
        }
        System.out.print(count);
    }
}