import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            for (int j = N - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = i + 1; j > 0; j--) {
                System.out.print("*");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j > 0; j--) {
                System.out.print(" ");
            }
            for(int j = N - 1; j > i; j--) {
                System.out.print("*");
            }
            for(int j = N - i - 2; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
