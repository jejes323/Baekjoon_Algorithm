import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(br.readLine());
        
        b += c;
        if(b >= 60) {
            int s = b / 60;
            b = b % 60;
            a += s;
        }
        if(a >= 24) a -= 24;
        System.out.println(a + " " + b);
    }
}