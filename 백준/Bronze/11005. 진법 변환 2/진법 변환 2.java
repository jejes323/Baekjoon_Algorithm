import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int bit = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        for(int i = num; i > 0; i = i / bit) {
            if(i % bit >= 10) {
                sb.append((char)(i % bit + 55));
            }
            else {
                sb.append(i % bit);
            }
        }
        System.out.print(sb.reverse());
    }
}