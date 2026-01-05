import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int n = 1;
        for(int i = 1; i <= a; i++) {
            n *= i;
        }
        
        int r = 1;
        for(int i = 1; i <=b; i++) {
            r *= i;
        }
        
        int r2 = 1;
        for(int i = 1; i <= a-b; i++) {
            r2 *= i;
        }
        
        System.out.print(n / (r*r2));
    }
}