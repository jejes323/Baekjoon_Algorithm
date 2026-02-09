import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        
        long mod = 1234567891;
        long base = 31;
        
        long hash = 0;
        long power = 1;
        
        for(int i = 0; i < n; i++) {
            int value = s.charAt(i) - 'a' + 1;
            hash = (hash + value * power) % mod;
            power = (power * base) % mod;
        }
        
        System.out.print(hash);
    }
}