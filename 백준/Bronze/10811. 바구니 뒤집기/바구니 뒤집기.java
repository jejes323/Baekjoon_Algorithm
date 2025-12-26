import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] num = new int[N];
        int tcase = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < N; i++) {
            num[i] = i + 1;
        }
        
        for(int i = 0; i < tcase; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken()) - 1;
            int last = Integer.parseInt(st.nextToken()) - 1;
            while(first < last) {
                int temp = num[first];
                num[first++] = num[last];
                num[last--] = temp;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(num[i]).append(" ");
        }
        System.out.print(sb);
    }
}