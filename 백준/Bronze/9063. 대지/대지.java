import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] x = new int[tcase];
        int[] y = new int[tcase];
        
        for(int i = 0; i < tcase; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        int xmin = x[0];
        int xmax = x[0];
        int ymin = y[0];
        int ymax = y[0];
        
        for(int i = 0; i < tcase; i++) {
            if(xmin > x[i]) xmin = x[i];
            if(ymin > y[i]) ymin = y[i];
            if(xmax < x[i]) xmax = x[i];
            if(ymax < y[i]) ymax = y[i];
        }
        
        int xresult = xmax - xmin;
        int yresult = ymax - ymin;
        
        System.out.print(xresult * yresult);
    }
}