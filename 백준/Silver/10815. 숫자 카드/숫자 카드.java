import java.io.*;
import java.util.*;

public class Main {
    static int[] card;
    public static int check(int target) {
        int left = 0;
        int right = card.length - 1;
        
        while(left <= right) {
            int mid = (left + right) / 2;
            
            if(card[mid] == target) return 1;
            else if(card[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        card = new int[a];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < a; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(card);
        
        StringBuilder sb = new StringBuilder();
        int b = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < b; i++) {
            int target = Integer.parseInt(st.nextToken());
            sb.append(check(target)).append(" ");
        }
        
        System.out.print(sb);
        
    }
}