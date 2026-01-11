import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        while(true) {
            String line = br.readLine();
            if (line.equals(".")) {
                break;
            }
            
            Deque<Character> dq = new ArrayDeque<>();
            
            
            boolean check = true;
            
            for(char c : line.toCharArray()) {
               if(c == '(' || c == '[') {
                   dq.push(c);
               } else if(c == ')') {
                   if(dq.isEmpty() || dq.pop() != '(') {
                       check = false;
                       break;
                   }
               } else if(c == ']') {
                   if(dq.isEmpty() || dq.pop() != '[') {
                       check = false;
                       break;
                   }
               }
            }
            
            if(check && dq.isEmpty()) sb.append("yes").append('\n');
            else sb.append("no").append('\n');
        }
        
        System.out.print(sb);
    }
}