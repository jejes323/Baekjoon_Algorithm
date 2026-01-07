import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        
        String[] arr = new String[tcase];
        for(int i = 0; i < tcase; i++) {
            String st = br.readLine();
            arr[i] = st;
        }
        
        Arrays.sort(arr, (a, b) -> {
            if(a.length() == b.length()) return a.compareTo(b);
            return a.length() - b.length();
        });
        
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append('\n');
        for(int i = 1; i < tcase; i++) {
            if(arr[i].equals(arr[i-1])) continue;
            sb.append(arr[i]).append('\n');
        }
        System.out.print(sb);
    }
}