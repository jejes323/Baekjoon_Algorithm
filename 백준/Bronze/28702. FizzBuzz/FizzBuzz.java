import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 3; i++) {
            String st = br.readLine();
            
            if(Character.isDigit(st.charAt(0))) {
                int num = Integer.parseInt(st) + (3 - i);
                
                if(num % 3 == 0 && num % 5 == 0) sb.append("FizzBuzz");
                else if(num % 3 == 0 && num % 5 != 0) sb.append("Fizz");
                else if(num % 3 != 0 && num % 5 == 0) sb.append("Buzz");
                else sb.append(num);
                break;
            }
        }
        
        System.out.print(sb);
    }
}