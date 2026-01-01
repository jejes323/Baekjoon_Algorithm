import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int tcase = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int[] num = new int[tcase];
        
        st = new StringTokenizer(br.readLine());
        for(int j = 0; j < tcase; j++) {
            num[j] = Integer.parseInt(st.nextToken());
        }
        
        int min = Integer.MAX_VALUE;
        int score = 0;
        for(int i = 0; i < tcase - 2; i++) {
            for(int j = i + 1; j < tcase; j++) {
                for(int k = j + 1; k < tcase; k++) {
                    if(num[i] + num[j] + num[k] > target) continue;
                    int result = Math.abs(num[i] + num[j] + num[k] - target);
                    if(result < min) {
                        min = result;
                        score = num[i] + num[j] + num[k];
                    }
                }
            }
        }
        System.out.print(score);
            
            
    }
}