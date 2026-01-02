import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int tcase = Integer.parseInt(br.readLine());
        int target = 665;
        for(int i = 0; i < tcase; i++) {
            while(true) {
                target++;
                String len = String.valueOf(target);
                boolean check = false;
                for(int j = 0; j < len.length() - 2; j++) {
                    if (len.charAt(j) == '6' && len.charAt(j + 1) == '6' && len.charAt(j + 2) == '6') {
                        check = true;
                        break;
                    }
                }
                if(check) {
                    break;
                }
            }
        }
        System.out.print(target);
    }
}