import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tcase; i++) {
            String st = br.readLine();
            sb.append(st.charAt(0)).append(st.charAt(st.length() - 1)).append("\n");
        }
        System.out.print(sb);
    }
}