import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        
        int sum = 0;
        int target = 0;
        for(int i = 0; i < 13; i++) {
            char c = st.charAt(i);
            
            if(c == '*') {
                target = i;
            } else {
                int num = c - '0';
                if(i % 2 == 0) {
                    sum += num * 1;
                } else {
                    sum += num * 3;
                }
            }
        }
        
        
        for(int i = 0; i <= 9; i++) {
            int tempsum = sum;
            if(target % 2 == 0) {
                tempsum += i * 1;
            } else {
                tempsum += i * 3;
            }
            
            if(tempsum % 10 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}