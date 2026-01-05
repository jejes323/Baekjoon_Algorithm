import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            String st = br.readLine();
            if(st.equals("0")) break;
            
            StringBuilder sb = new StringBuilder(st);
            if(st.equals(sb.reverse().toString())) {
                System.out.println("yes");
            } else System.out.println("no");
        }
        
    }
}