import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= tcase; i++) {
            for(int j = tcase; j > i; j--) {
                System.out.print(" ");
            }
            for(int s = 1; s <= i; s++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}