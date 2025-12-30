import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int count = 0;
        
        for(int i = 0; i < tcase; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(a < 2) continue;
            boolean check = true;
            
            for(int j = 2; j * j <= a; j++) {
                if(a % j == 0) {
                    check = false;
                    break;
                }
            }
            if(check) count++;
        }
        System.out.print(count);
    }
}