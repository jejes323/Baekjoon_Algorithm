import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] num = new int[N];
        
        for(int a = 0; a < N; a++) {
            num[a] = a+1;
        }
        for(int a = 0; a < M; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int swap = num[i - 1];
            num[i - 1] = num[j - 1];
            num[j - 1] = swap;
        }
        StringBuilder sb = new StringBuilder();
        for(int a = 0; a < N; a++) {
            sb.append(num[a] + " ");
        }
        System.out.print(sb);
    }
}