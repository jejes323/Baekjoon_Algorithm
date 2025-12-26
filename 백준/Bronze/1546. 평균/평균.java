import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        int[] num = new int[tcase];
        
        int max = num[0];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < tcase; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            if(max < num[i]) max = num[i];
        }
        float sum = 0;
        for(int i = 0; i < tcase; i++) {
            sum += ((float)num[i] / max) * 100;
        }
        System.out.print(sum / tcase);
    }
}