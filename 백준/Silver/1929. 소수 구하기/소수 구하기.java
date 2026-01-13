import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int first = Integer.parseInt(st.nextToken());
        int last = Integer.parseInt(st.nextToken());
        
        boolean[] arr = new boolean[last + 1];
        
        arr[0] = true;
        arr[1] = true;
        
        for(int i = 2; i * i <= last; i++) {
            if(!arr[i]) {
                for(int j = i * i; j <= last; j += i) {
                    arr[j] = true;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = first; i <= last; i++) {
            if(!arr[i]) sb.append(i).append('\n');
        }
        System.out.print(sb);
    }
}