import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int tcase = Integer.parseInt(st.nextToken());
        int win = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[tcase];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < tcase; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            
        }
        
        Arrays.sort(arr);
        System.out.print(arr[tcase - win]);
           
    }
}