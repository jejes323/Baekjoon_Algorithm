import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[15][5];
        for(int i = 0; i < 5; i++) {
            String st = br.readLine();
            for(int j = 0; j < st.length(); j++) {
                arr[j][i] = st.charAt(j);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {
                if(arr[i][j] != 0) sb.append(arr[i][j]);
            }
        }
        System.out.print(sb);
        
    }
}