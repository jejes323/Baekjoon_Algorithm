import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String num = st.nextToken();
        int bit = Integer.parseInt(st.nextToken());
        
        int result = 0;
        for(int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int value;
            if(c >= 'A') { 
                value = c - 55;
            } else {
                value = c - '0';
            }
            result += value * (int)Math.pow(bit, num.length() - 1 - i);
        }
        System.out.print(result);
    }
}