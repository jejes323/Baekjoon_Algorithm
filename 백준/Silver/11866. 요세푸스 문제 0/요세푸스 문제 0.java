import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 1; i <= N; i++) {
            dq.addLast(i);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        while(dq.size() != 0) {
            
            for(int i = 0; i < target - 1; i++) {
                dq.addLast(dq.pollFirst());
            }
            if(dq.size() == 1) sb.append(dq.pollFirst());
            else sb.append(dq.pollFirst()).append(", ");
            
        }
        sb.append('>');
        
        System.out.println(sb);
    }
}