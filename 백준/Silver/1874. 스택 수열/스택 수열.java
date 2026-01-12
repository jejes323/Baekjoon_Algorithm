import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        
        Deque<Integer> dq = new ArrayDeque<>();
        int count = 0;
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tcase; i++) {
            int num = Integer.parseInt(br.readLine());
            
            
            while(count < num) {
                count++;
                dq.push(count);
                sb.append('+').append('\n');

            }
            
            if(!dq.isEmpty() && dq.peek() == num) {
                dq.pop();
                sb.append('-').append('\n');
            } else {
                System.out.print("NO");
                return;
            }
        }
        
        System.out.print(sb);
    }
}