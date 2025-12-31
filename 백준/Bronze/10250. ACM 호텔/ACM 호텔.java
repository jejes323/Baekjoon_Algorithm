import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0; i < tcase; i++) {
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int count = 0;
            boolean check = false;
            StringBuilder sb = new StringBuilder();
            for(int j = 1; j <= w; j++) {
                for(int k = 1; k <= h; k++) {
                    count++;
                    if(count == n) {
                        sb.append(k);
                        if(j < 10) sb.append(0);
                        sb.append(j).append('\n');
                        check = true;
                        break;
                    }
                }
                if(check) break;
            }
            System.out.print(sb);
        }
    }
}