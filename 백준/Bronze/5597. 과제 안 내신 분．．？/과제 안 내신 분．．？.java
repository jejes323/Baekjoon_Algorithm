import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[30];
        for(int i = 0; i < 28; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            num[a - 1] = 1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 30; i++) {
            if(num[i] == 0) {
                sb.append(i+1).append("\n");
                 
            }
        }
        System.out.print(sb);
    }
}