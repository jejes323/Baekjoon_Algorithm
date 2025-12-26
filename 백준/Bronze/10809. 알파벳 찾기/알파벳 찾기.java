import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            
            int[] num = new int[26];
            for(int i = 0; i < 26; i++) {
                num[i] = -1;
            }
            for(int i = 0; i < str.length(); i++) {
                if(num[str.charAt(i) - 'a'] == -1) num[str.charAt(i) - 'a'] = i;
                
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 26; i++) {
                sb.append(num[i]).append(" ");
            }
            System.out.print(sb);
    }
}