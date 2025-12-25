import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] num = new int[M];
        
        for(int a = 0; a < N; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            for(int b = i - 1; b <= j - 1; b++) {
                num[b] = k;
            }
        }
        
        for(int a = 0; a < M; a++) {
            System.out.print(num[a] + " ");
        }
    }
}