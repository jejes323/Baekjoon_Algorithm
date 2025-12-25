import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        int tcase = a / 4;
        for(int i = 1; i <= tcase; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
        
    }
}