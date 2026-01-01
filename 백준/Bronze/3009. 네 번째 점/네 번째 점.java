import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] x = new int[3];
        int[] y = new int[3];
        
        for(int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        
        int xtarget = 0;
        int ytarget = 0;
        if(x[0] == x[1]) xtarget = x[2];
        else if(x[0] == x[2]) xtarget = x[1];
        else xtarget = x[0];
        
        if(y[0] == y[1]) ytarget = y[2];
        else if(y[0] == y[2]) ytarget = y[1];
        else ytarget = y[0];
        
        System.out.print(xtarget + " " + ytarget);
        
    }
}