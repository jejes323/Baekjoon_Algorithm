import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for(int i = 0; i < tcase; i++) {
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            
            if(n % h != 0) {
                sb.append(n % h);
            } else {
                sb.append(h);
            }
            
            if(n % h != 0) {
                if(n / h + 1 < 10) {
                    sb.append(0).append(n / h + 1).append('\n');
                } else {
                    sb.append(n / h + 1).append('\n');
                }
            } else {
                if(n / h < 10) {
                    sb.append(0).append(n / h).append('\n');
                } else {
                    sb.append(n / h).append('\n');
                }
            }
        }
        System.out.print(sb);
    }
}