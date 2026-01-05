import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int min = a;
        if(b < a) {
            min = b;
        }
        StringBuilder sb = new StringBuilder();
        int target_max = 1;
        for(int i = 2; i <= min; i++) {
            if(a % i == 0 && b % i == 0) {
                target_max = i;
            }
        }
        sb.append(target_max).append('\n').append((a / target_max) * b);
        System.out.print(sb);
        
    }
}
