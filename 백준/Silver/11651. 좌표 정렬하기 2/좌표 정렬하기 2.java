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
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            arr[i][0] = x;
            arr[i][1] = y;
        }
        
        Arrays.sort(arr, (a, b) -> {
            if(a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tcase; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
        }
        
        
        System.out.print(sb);
    }
}