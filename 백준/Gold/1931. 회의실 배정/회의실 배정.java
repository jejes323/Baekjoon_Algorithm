import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[N][2];
        
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr, (a1, a2) -> {
            if(a1[1] == a2[1]) return a1[0] - a2[0];
            else return a1[1] - a2[1];
        });
        
        int endtime = 0;
        int count = 0;
        
        
        for(int i = 0; i < N; i++) {
            if(arr[i][0] >= endtime) {
                count++;
                endtime = arr[i][1];
            }
        }
        System.out.println(count);
               
    }
}