import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        int answer = 0;
           
        for(int i = 1; i <= target; i++) {
            int sum = i;
            int temp = i;
            
            while(temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            
            if(sum == target) {
                answer = i;
                break;
            }
        }
        System.out.print(answer);
    }
}