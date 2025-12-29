import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = 2; // 가로 점 갯수
        for(int i = a; i > 0; i--) {
            b = b * 2 - 1;
        }
        System.out.print(b*b);
        
    }
}