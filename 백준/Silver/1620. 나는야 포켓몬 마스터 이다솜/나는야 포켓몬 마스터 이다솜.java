import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); // 포켓몬 수
        int M = Integer.parseInt(st.nextToken()); // 문제 수
        
        String[] arr = new String[N + 1];
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 1; i <= N; i++) {
            String name = br.readLine();
            arr[i] = name;
            map.put(name, i);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < M; i++) {
            String input = br.readLine();
            
            if(input.charAt(0) >= '0' && input.charAt(0) <= '9') {
                int num = Integer.parseInt(input);
                sb.append(arr[num]).append('\n');
            } else {
                sb.append(map.get(input)).append('\n');
            }
            
        }
        
        System.out.println(sb);
    }
}