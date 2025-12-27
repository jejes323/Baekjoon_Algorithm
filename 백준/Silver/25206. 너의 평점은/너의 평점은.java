import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        double sum = 0.0;
        double result = 0.0;
        for(int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            float score = Float.parseFloat(st.nextToken());
            String grade = st.nextToken();
            
            double rank = 0;
            if(grade.equals("A+")) rank = 4.5;
            else if(grade.equals("A0")) rank = 4.0;
            else if(grade.equals("B+")) rank = 3.5;
            else if(grade.equals("B0")) rank = 3.0;
            else if(grade.equals("C+")) rank = 2.5;
            else if(grade.equals("C0")) rank = 2.0;
            else if(grade.equals("D+")) rank = 1.5;
            else if(grade.equals("D0")) rank = 1.0;
            else if(grade.equals("F")) rank = 0.0;
            else if(grade.equals("P")) sum -= score;
            sum += score;
            result += rank * score;
        }
        System.out.print(result / sum);
    }
}