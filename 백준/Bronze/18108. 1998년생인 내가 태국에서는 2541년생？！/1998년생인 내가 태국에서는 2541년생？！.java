import java.io.*;

public class Main {
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int a = Integer.parseInt(str);
        System.out.println(a - 543);
    }
}