import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        
        Deque<Integer> dq = new ArrayDeque<>();
        
        for(int i = 0; i < tcase; i++) {
            int a = Integer.parseInt(br.readLine());
            
            if(a == 0) {
                dq.pop();
            }
            else {
                dq.push(a);
            }
        }
        
        int sum = 0;
        while(!dq.isEmpty()) {
            sum += dq.pop();
        }
        
        System.out.println(sum);
    }
}