import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        
        int money = 0;
        if(a == b && a == c) {
            money += 10000;
            money += a * 1000;
        } else if (a == b || a == c || b == c) {
            money += 1000;
            if(a == b || a == c) money += a * 100;
            else if(b == c) money += b * 100;
        } else {
            if (a > b && a > c) money += a*100;
            else if (b > a && b > c) money += b*100;
            else money += c*100;
        }
        
        System.out.println(money);
    }
}