import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int x = a;
        int y = b;
        
        while(y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(x).append('\n').append((a / x) * b);
        System.out.print(sb);
        
    }
}
