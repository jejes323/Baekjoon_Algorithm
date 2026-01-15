import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        
        int[][] dp = new int[15][15]; // 층, 호
        
        for(int i = 0 ; i < 15; i++) {
            dp[i][1] = 1; // n층의 1호는 전부 1
            dp[0][i] = i; // 0층는 1, 2, 3, 4 ...
        }
        
        for(int i = 1; i < 15; i++) { // 1층 부터 14층
            for(int j = 2; j < 15; j++) { // 2호 부터 14호
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tcase; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            sb.append(dp[a][b]).append('\n');
            
        }
        
        System.out.print(sb);
    }
}