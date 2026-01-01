import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String st = String.valueOf(a * b * c);
        
        int[] num = new int[10];
        
        for(int i = 0; i < st.length(); i++) {
            int target = st.charAt(i) - '0';
            num[target]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 10; i++) {
            sb.append(num[i]).append('\n');
        }
        System.out.print(sb);
    }
}