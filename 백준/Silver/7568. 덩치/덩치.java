import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        int[][] arr = new int[tcase][2];
        
        for(int i = 0; i < tcase; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i][0] = a;
            arr[i][1] = b;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tcase; i++) {
            int rank = 1;
            for(int j = 0; j < tcase; j++) {
                if(arr[j][0] > arr[i][0] && arr[j][1] > arr[i][1]) {
                    rank++;
                }
            }
            sb.append(rank).append(" ");
        }
        System.out.print(sb);
    }
}