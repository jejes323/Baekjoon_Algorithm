import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int b3 = 0;
        int b5 = 0;

        int result;
        int tcase = n / 5;
        boolean check = false;
        
        for(int i = tcase; i >= 0; i--) {
            result = n - (5*i);
            
            if(result % 3 == 0) {
                b3 += result / 3;
                b5 += i;
                check = true;
                break;
            }
        }
        
        
        if(check) System.out.print(b3 + b5);
        else System.out.print("-1");
   }
}