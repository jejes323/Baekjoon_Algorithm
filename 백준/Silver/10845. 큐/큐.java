import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            
            
            if(a.equals("push")) {
                int b = Integer.parseInt(st.nextToken());
                dq.addLast(b);
            } else if(a.equals("pop")) {
                if(dq.isEmpty()) sb.append("-1").append('\n');
                else sb.append(dq.pollFirst()).append('\n');
            } else if(a.equals("size")) {
                sb.append(dq.size()).append('\n');
            } else if(a.equals("empty")) {
                if(dq.isEmpty()) sb.append("1").append('\n');
                else sb.append("0").append('\n');
            } else if(a.equals("front")) {
                if(dq.isEmpty()) sb.append("-1").append('\n');
                else sb.append(dq.peekFirst()).append('\n');
            } else if(a.equals("back")) {
                if(dq.isEmpty()) sb.append("-1").append('\n');
                else sb.append(dq.peekLast()).append('\n');
            }
        }
       
        System.out.print(sb);
    }
}