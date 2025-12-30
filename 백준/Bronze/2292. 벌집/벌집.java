import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int i = 0;
        int a = 1;
        while(true) {
            a = (6 * i) + a;
            if(a < N && N <= (6 * (i+1)) + a) {
                break;
            }
            i++;
        }
        if(N == 1) i = -1;
        System.out.print(i + 2);
        
    }
}