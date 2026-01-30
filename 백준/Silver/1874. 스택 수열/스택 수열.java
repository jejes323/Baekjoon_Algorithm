import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        
        Deque<Integer> dq = new ArrayDeque<>();
        int n = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= tcase; i++) {
            int target = Integer.parseInt(br.readLine());
            
            while(n < target) {
                n++;
                dq.push(n);
                sb.append('+').append('\n');
            }
            
            if(!dq.isEmpty() && dq.peekFirst() == target) {
                dq.pop();
                sb.append('-').append('\n');
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}