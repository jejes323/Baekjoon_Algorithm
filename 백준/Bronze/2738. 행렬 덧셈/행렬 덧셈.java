import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int[][] num1 = new int[a][b];
        
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < a; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < b; k++) {
                    num1[j][k] += Integer.parseInt(st.nextToken());
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                sb.append(num1[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}