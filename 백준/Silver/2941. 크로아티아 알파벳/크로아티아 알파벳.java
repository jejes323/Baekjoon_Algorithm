import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int count = 0;
    
        for(int i = 0; i < st.length(); i++) {
            char a = st.charAt(i);
            if(a == 'c' && i < st.length() - 1) {
                if(st.charAt(i+1) == '=' || st.charAt(i+1) == '-') {
                    i++;
                }
            } else if(a == 'd' && i < st.length() - 1) {
                if(st.charAt(i+1) == '-') {
                    i++;
                } else if(st.charAt(i+1) == 'z' && i < st.length() - 2) {
                    if(st.charAt(i+2) == '=') {
                        i+=2;
                    }
                }
            } else if((a == 'l' || a == 'n') && i < st.length() -1 && st.charAt(i+1) == 'j') { 
                i++;
            } else if((a == 's' || a == 'z') && i < st.length() - 1 && st.charAt(i+1) == '=') {
                i++;
            }
            count++;
        }
        System.out.print(count);
    }
}