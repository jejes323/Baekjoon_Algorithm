import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int tcase = Integer.parseInt(br.readLine());
        
        int S = 0;
        
        for(int i = 0; i < tcase; i++) {
            String line = br.readLine();
            
            if(line.equals("all")) S = (1 << 20) - 1;
            else if(line.equals("empty")) S = 0;
            else {
                StringTokenizer st = new StringTokenizer(line);
                String cmd = st.nextToken();
                int x = Integer.parseInt(st.nextToken());
                
                int bit = 1 << (x - 1);
                
                switch(cmd) {
                    case "add":
                        S |= bit;
                        break;
                    case "remove":
                        S &= ~bit;
                        break;
                    case "check":
                        if((S & bit) != 0) sb.append("1\n");
                        else sb.append("0\n");
                        break;
                    case "toggle":
                        S ^= bit;
                        break;
                }
            }
        }
        
        System.out.println(sb);
    }
}