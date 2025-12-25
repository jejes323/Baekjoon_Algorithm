import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int tcase = Integer.parseInt(br.readLine());
        for(int i = 1; i <= tcase; i++) {
            String str = br.readLine();
            int target = str.indexOf(" ");
            int result = Integer.parseInt(str.substring(0, target)) + Integer.parseInt(str.substring(target + 1));
            sb.append(result + "\n");
        }
        
        br.close();
        System.out.println(sb);
        
    }
}