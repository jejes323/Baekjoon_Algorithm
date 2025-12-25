import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= a; i++) {
            for(int f = 1; f <= i; f++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}