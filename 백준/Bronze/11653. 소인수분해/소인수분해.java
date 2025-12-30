import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                sb.append(i).append("\n");
                n = n / i;
                i = 1;
            }
        }
        System.out.print(sb);
    }
}