import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashSet<String> set = new HashSet<>();
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i = 0; i < N; i++) {
            String name = br.readLine();
            set.add(name);
        }
        
        for(int i = 0; i < M; i++) {
            String name = br.readLine();
            if(set.contains(name)) {
                arr.add(name);
            }
        }
        
        Collections.sort(arr);
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(arr.size()).append('\n');
        for(String s : arr) {
            sb.append(s).append('\n');
        }
        
        System.out.print(sb);
    }
    
}