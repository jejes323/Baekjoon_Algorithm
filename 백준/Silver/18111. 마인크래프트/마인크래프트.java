import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        int[][] arr = new int[N][M];
        int min = 256;
        int max = 0;
        
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, arr[i][j]);
                max = Math.max(max, arr[i][j]);
            }
        }
        
        int resultTime = Integer.MAX_VALUE;
        int resultHeight = 0;
        
        for(int h = min; h <= max; h++) {
            int remove = 0;
            int add = 0;
            
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    if(arr[i][j] > h) {
                        remove += arr[i][j] - h;
                    } else if(arr[i][j] < h) {
                        add += h - arr[i][j];
                    }
                }
                
            }
            
                            if(remove + B >= add) {
                    int time = remove * 2 + add;
                    if(time <= resultTime) {
                        resultTime = time;
                        resultHeight = h;
                    }
                }
        }
        System.out.println(resultTime + " " + resultHeight);
    }
}