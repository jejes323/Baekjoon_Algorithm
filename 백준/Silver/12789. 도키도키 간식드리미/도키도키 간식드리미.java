import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        
        int target = 1;
        
        for(int i = 0; i < tcase; i++) {
            int num = Integer.parseInt(st.nextToken());
            
            if(num == target) {
                target++;
            } else {
                dq.push(num);
            }
            
            while(!dq.isEmpty() && dq.peek() == target) {
                dq.pop();
                target++;
            }
            
        }
        
        StringBuilder sb = new StringBuilder();
        if(dq.isEmpty()) sb.append("Nice");
        else sb.append("Sad");
        
        System.out.print(sb);
    }
}