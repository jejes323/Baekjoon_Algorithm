import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] num = new int[9][9];
        int index1 = 1;
        int index2 = 1;
        
        int max = 0;
        for(int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j <9; j++) {
                num[i][j] = Integer.parseInt(st.nextToken());
                if(num[i][j] > max)  {
                    max = num[i][j];
                    index1 = i + 1;
                    index2 = j + 1;
                }
            }
        }
        System.out.print(max + "\n" + index1 + " " + index2);
    }
}