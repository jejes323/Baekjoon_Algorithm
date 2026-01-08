import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tcase; i++) {
            char[] arr = br.readLine().toCharArray();
            Deque<Character> dq = new ArrayDeque<>();
            
            boolean check = true;
            
            for(char c : arr) {
                if(c =='(') {
                    dq.push(c);
                } else if (c == ')') {
                    if(dq.isEmpty()) {
                        check = false;
                        break;
                    }
                    dq.pop();
                }
            }
            if(check && dq.isEmpty()) sb.append("YES").append('\n');
            else sb.append("NO").append('\n');
        }
        System.out.print(sb);
    }
}