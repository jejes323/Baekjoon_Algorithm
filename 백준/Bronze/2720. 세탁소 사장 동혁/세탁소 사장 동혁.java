import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        int quarter = 0; // 25
        int dime = 0; // 10
        int nickel = 0; // 5
        int penny = 0; // 1
        
        for(int i = 0; i < tcase; i++) {
            int a = Integer.parseInt(br.readLine());
            quarter = a / 25;
            dime = (a % 25) / 10;
            nickel = ((a % 25) % 10) / 5;
            penny = (a % 5);
            sb.append(quarter).append(" ").append(dime).append(" ").append(nickel).append(" ").append(penny).append("\n");
            
        }
        System.out.print(sb);
    }
}