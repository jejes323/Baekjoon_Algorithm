import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < tcase; i++) {
            int score = 0;
            int count = 1;
            String st = br.readLine();
            for(int j = 0; j < st.length(); j++) {
                if(st.charAt(j) == 'O') {
                    score += count;
                    count++;
                }
                if(j != st.length() - 1 && st.charAt(j+1) == 'X') {
                    count = 1;
                }
            }
            System.out.println(score);
        }
    }
}