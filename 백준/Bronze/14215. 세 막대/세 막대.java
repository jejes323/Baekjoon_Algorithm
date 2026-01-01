import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
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
            min1 = b;
            min2 = a;
        }
        if(min1 + min2 <= max) {
            max = min1 + min2 - 1;
        }
        
        System.out.print(min1 + min2 + max);
    }
}