import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        
        Deque<int[]> dq = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < tcase; i++) {
            int a = Integer.parseInt(st.nextToken());
            dq.addLast(new int[] {i+1, a});
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!dq.isEmpty()) {
            int[] cur = dq.pollFirst();
            int index = cur[0];
            int move = cur[1];
            
            
            sb.append(index).append(' ');
            if (dq.isEmpty()) break;
            if(move > 0) { // 풍선 값이 양수 일 경우
                for(int i = 0; i < move - 1; i++) {
                    dq.addLast(dq.pollFirst());
                }
            } else if (move < 0) { // 풍선 값이 음수 일 경우
                for(int i = 0; i < -move; i++) {
                    dq.addFirst(dq.pollLast());
                }
            
            }
        }
        
        System.out.print(sb);
    }
}