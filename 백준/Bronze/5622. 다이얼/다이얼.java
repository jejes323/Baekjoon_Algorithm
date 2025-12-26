import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int sum = 0;
        for(int i = 0; i < st.length(); i++) {
            if(st.charAt(i) == 'A' || st.charAt(i) == 'B' || st.charAt(i) == 'C') sum += 3;
            else if (st.charAt(i) == 'D' || st.charAt(i) == 'E' || st.charAt(i) == 'F') sum += 4;
            else if (st.charAt(i) == 'G' || st.charAt(i) == 'H' || st.charAt(i) == 'I') sum += 5;
            else if (st.charAt(i) == 'J' || st.charAt(i) == 'K' || st.charAt(i) == 'L') sum += 6;
            else if (st.charAt(i) == 'M' || st.charAt(i) == 'N' || st.charAt(i) == 'O') sum += 7;
            else if (st.charAt(i) == 'P' || st.charAt(i) == 'Q' || st.charAt(i) == 'R' || st.charAt(i) == 'S') sum += 8;
            else if (st.charAt(i) == 'T' || st.charAt(i) == 'U' || st.charAt(i) == 'V') sum += 9;
            else if (st.charAt(i) == 'W' || st.charAt(i) == 'X' || st.charAt(i) == 'Y' || st.charAt(i) == 'Z') sum += 10;
        }
        System.out.print(sum);
    }
}