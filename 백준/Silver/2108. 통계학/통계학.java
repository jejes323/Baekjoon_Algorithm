import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        int[] arr = new int[tcase];
        int[] count = new int[8001];
        
        int sum = 0;
        int max = -4001;
        int min = 4001;
        
        for(int i = 0; i < tcase; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
            sum += a;
            
            count[a + 4000]++;
            max = Math.max(max, a);
            min = Math.min(min, a);
        }
        
        Arrays.sort(arr);
        
        int avg = (int) Math.round((double) sum / tcase);
        int mid = arr[tcase / 2];
        int maxCount = 0;
        for(int i = 0; i < 8001; i++) {
            maxCount = Math.max(maxCount, count[i]);
        }
        
        int mode = 0;
        boolean second = false;
        for(int i = 0; i < 8001; i++) {
            if(maxCount == count[i]) {
                if(!second) {
                    mode = i - 4000;
                    second = true;
                } else {
                    mode = i - 4000;
                    break;
                }
            }
        }
        
        int range = max - min;
        
        StringBuilder sb = new StringBuilder();
        sb.append(avg).append('\n').append(mid).append('\n').append(mode).append('\n').append(range).append('\n');
        System.out.println(sb);
    }
}