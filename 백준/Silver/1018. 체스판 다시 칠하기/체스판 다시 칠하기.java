import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 열
        int m = Integer.parseInt(st.nextToken()); // 행
        char[][] board = new char[n][m];
        
        for(int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }
        
        int answer = Integer.MAX_VALUE;
        
        for(int i = 0; i <= n - 8; i++) {
            for(int j = 0; j <= m - 8; j++) {
                
                int valueW = 0;
                int valueB = 0;
                
                for(int x = i; x < i + 8; x++) {
                    for(int y = j; y < j + 8; y++) {
                        char exw = ((x + y) % 2 == 0) ? 'W' : 'B';
                        char exb = ((x + y) % 2 == 0) ? 'B' : 'W';
                
                        if(board[x][y] != exw) valueW++;
                        if(board[x][y] != exb) valueB++;
                    }
                }
                
                int cur = Math.min(valueW, valueB);
                answer = Math.min(answer, cur);
            }
        }
        
        System.out.print(answer);
    }
}