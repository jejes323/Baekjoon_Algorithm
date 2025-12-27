import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int count = 0;
        for(int i = 0; i < N; i++) {
            String st = br.readLine();
            boolean[] alpha = new boolean[26];
            boolean check = true;
            
            for(int j = 1; j < st.length(); j++) {
                if(st.charAt(j) != st.charAt(j-1)) {
                    alpha[(st.charAt(j-1)) - 'a'] = true;
                    if(alpha[(st.charAt(j) - 'a')]) {
                        check = false;
                        break;
                    }
                }
            }
            if(check) {
                count++;
            }
        }
        System.out.print(count);
    }
}