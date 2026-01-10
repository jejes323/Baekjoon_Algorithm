import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int tcase = Integer.parseInt(br.readLine());
        
        Deque<Integer> dq = new ArrayDeque<>();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            
            if(a == 1) {
                int b = Integer.parseInt(st.nextToken());
                dq.addFirst(b);
            } else if(a == 2) {
                int b = Integer.parseInt(st.nextToken());
                dq.addLast(b);
            } else if(a == 3) {
                if(dq.isEmpty()) sb.append("-1").append('\n');
                else sb.append(dq.pollFirst()).append('\n');
            } else if(a == 4) {
                if(dq.isEmpty()) sb.append("-1").append('\n');
                else sb.append(dq.pollLast()).append('\n');
            } else if(a == 5) {
                sb.append(dq.size()).append('\n');
            } else if(a == 6) {
                if(dq.isEmpty()) sb.append("1").append('\n');
                else sb.append("0").append('\n');
            } else if(a == 7) {
                if(dq.isEmpty()) sb.append("-1").append('\n');
                else sb.append(dq.peekFirst()).append('\n');
            } else if(a == 8) {
                if(dq.isEmpty()) sb.append("-1").append('\n');
                else sb.append(dq.peekLast()).append('\n');
            }
        }
        
        System.out.print(sb);
    }
}