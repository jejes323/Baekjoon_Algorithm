import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] num = new boolean[42];
        
        int count = 0;
        for(int i = 0; i < 10; i ++) {
            int a = Integer.parseInt(br.readLine());
            int target_num = a % 42;
            if(!num[target_num]) {
                num[target_num] = true;
                count++;
            }
        }
        System.out.println(count);
    }
}