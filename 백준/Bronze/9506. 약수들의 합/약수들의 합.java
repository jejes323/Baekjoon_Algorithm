import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           
        while(true) {
            int a = Integer.parseInt(br.readLine());
            if(a == -1) break;
            
            int sum = 0;
            for(int i = 1; i < a; i++) {
                if(a % i == 0) {
                    sum += i;
                }
            }
            if(a == sum) {
                StringBuilder sb = new StringBuilder();
                sb.append(a).append(" = ");
                for(int i = 1; i < a; i++) {
                    if(a%i == 0) {
                        sb.append(i).append(" + ");
                    }
                }
                sb.delete(sb.length() - 2, sb.length());
                System.out.println(sb);
            } else {
                System.out.println(a + " is NOT perfect.");
            }
        }
    }
}