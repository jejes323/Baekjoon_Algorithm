import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        
        int sum = 0;
        int min = b;
        for(int i = a; i <= b; i++) {
            if(i == 1) continue;
            boolean check = true;
            for(int j = 2; j * j <= i; j++) {
                if(i % j == 0) {
                    check = false;
                    break;
                }
            }
            if(check) {
                sum += i;
                if(min > i) min = i;
            }
        }
        if(sum == 0) System.out.println(-1);
        else { 
            System.out.println(sum);
            System.out.println(min);
        }
    }
}