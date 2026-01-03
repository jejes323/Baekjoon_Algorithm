import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0 && c == 0) break;
            
            int max = a;
            int min1 = b;
            int min2 = c;
            if(max < b) {
                max = b;
                min1 = a;
                min2 = c;
            }
            if(max < c) {
                max = c;
                min1 = a;
                min2 = b;
            }
            
            if(min1 * min1 + min2 * min2 == max * max) sb.append("right").append('\n');
            else sb.append("wrong").append('\n');
        }
        System.out.print(sb);
    }
}