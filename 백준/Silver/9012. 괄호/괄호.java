import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        
        
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tcase; i++) {
            Deque<Character> dq = new ArrayDeque<>();
            String st = br.readLine();
            boolean check = true;
            for(int j = 0; j < st.length(); j++) {
                char c = st.charAt(j);
                
                if(c == '(') {
                    dq.push('(');
                } else if (c == ')') {
                    if (!dq.isEmpty()) {
                        dq.pop();
                    }
                    else check = false;
                }
                
            }
            if(dq.isEmpty() && check) sb.append("YES").append('\n');
            else sb.append("NO").append('\n');
        }
        System.out.println(sb);
    }
}