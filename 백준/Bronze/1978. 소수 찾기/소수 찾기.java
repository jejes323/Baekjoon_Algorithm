import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int count = 0;
        
        for(int i = 0; i < tcase; i++) {
            boolean check = true;
            int a = Integer.parseInt(st.nextToken());
            for(int j = 2; j < a; j++) {
                if(a % j == 0) {
                    check = false;
                    break;
                }
            }
            if(check && a != 1) count++;
        }
        System.out.print(count);
    }
}