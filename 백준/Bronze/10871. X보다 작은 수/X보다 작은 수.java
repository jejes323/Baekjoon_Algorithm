import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int target = Integer.parseInt(str[1]);
        String[] number = br.readLine().split(" ");
        for(int i = 0; i < N; i++) {
            if(Integer.parseInt(number[i]) < target) {
                System.out.print(Integer.parseInt(number[i]) + " ");
            }
        }
        
    }
}