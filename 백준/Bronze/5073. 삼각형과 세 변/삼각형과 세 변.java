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
            
            if(max < min1 + min2) {
                if(a == b && b == c) sb.append("Equilateral").append('\n');
                else if(a == b || a == c || b == c) sb.append("Isosceles").append('\n');
                else if(a != b && b != c) sb.append("Scalene").append('\n');
            } else sb.append("Invalid").append('\n');
        }
        System.out.print(sb);
    } 
}