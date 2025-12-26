import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine().toLowerCase();
        int[] alpha = new int[26];
        for(int i = 0; i < 26; i++) {
            for(int j = 0; j < st.length(); j++) {
                if(i == (st.charAt(j) - 'a')) alpha[i] += 1;
            }
        }
        int max = 0;
        int max_index = 0;
        boolean check = false;
        for(int i = 0; i < 26; i++) {
            if(max < alpha[i]) {
                max = alpha[i];
                max_index = i;
                check = true;
            }
            else if(max == alpha[i]) {
                check = false;
            }
        }
        if(check == false) System.out.print("?");
        else System.out.print((char)('A' + max_index));
    }
}