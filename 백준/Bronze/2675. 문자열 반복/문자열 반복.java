import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tcase; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            String st = str.nextToken();
            for(int j = 0; j < st.length(); j++) {
                for(int k = 0; k < a; k++) {
                    sb.append(st.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
        
    }
}