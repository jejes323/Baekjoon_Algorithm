import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int[] size = new int[6];
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 6; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0; i < 6; i++) {
            if(size[i] ==0 ) continue;
            if((double)size[i] / (double)t > 1) {
                count += size[i] / t;
                if(size[i] % t != 0) {
                    count++;
                    continue;
                } else continue;
            }
            count++;
        }
        sb.append(count).append('\n').append(n / p).append(" ").append(n % p);
        System.out.print(sb);
    }
}