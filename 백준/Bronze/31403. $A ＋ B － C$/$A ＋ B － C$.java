import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        System.out.println(a + b - c);
        int d = Integer.parseInt(String.valueOf(a)+String.valueOf(b)) - c;
        System.out.print(d);
    }
}