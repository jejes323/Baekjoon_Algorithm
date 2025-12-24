import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int testcase = Integer.parseInt(br.readLine());
        
        int sum = 0;
        
        for(int i = 1; i <= testcase; i++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            sum += a*b;
        }
        if(sum == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}