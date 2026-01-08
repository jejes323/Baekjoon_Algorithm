import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        
        Deque<int[]> dq = new ArrayDeque<>();
        
        for(int i = 0; i < tcase; i++) {
            int a = Integer.parseInt(br.readLine());
            
            if(a == 0) {
                dq.pollLast();
            } else {
                dq.add(new int[] {a, i});
            } 
        }
        
        int sum = 0;
        for(int[] x : dq) {
            sum += x[0];
        }
        
        System.out.print(sum);
    }
}