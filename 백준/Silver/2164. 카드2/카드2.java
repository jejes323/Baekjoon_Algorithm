import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 1 ; i <= a; i++) {
            dq.addLast(i);
        }
       
        
        while(dq.size() != 1) {
            dq.pollFirst();
            
            if(dq.size() != 1) dq.addLast(dq.pollFirst());
        }
        
        System.out.println(dq.peekFirst());
    }
}