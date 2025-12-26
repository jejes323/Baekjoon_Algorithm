import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[10];
        for(int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int result = a % 42;
            for(int j = 0; j < 10; j++) {
                if (num[j] == result) {
                    num[j] = 42;
                }
            }
            num[i] = result;
        }
        int count = 0;
        for(int i = 0; i <10; i++) {
            if(num[i] != 42) count++;
        }
        System.out.print(count);
    }
}