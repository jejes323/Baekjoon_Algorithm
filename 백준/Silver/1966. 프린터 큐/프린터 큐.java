import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tcase;i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine());
            Deque<int[]> dq = new ArrayDeque<>();
            for(int j = 0; j < n; j++) {
                int a = Integer.parseInt(st.nextToken());
                dq.add(new int[] {a, j});
            }
            
            int count = 0;
            while(!dq.isEmpty()) {
                int[] first = dq.poll();
                boolean check = false;
                
                for(int[] x : dq) {
                    if(x[0] > first[0]) {
                        check = true;
                        break;
                    }
                }
                
                if(check) {
                    dq.addLast(first);
                } else {
                    count++;
                    if(first[1] == m) {
                        sb.append(count).append('\n');
                        break;
                    }
                }
            }
        }
        System.out.print(sb);
    }
}