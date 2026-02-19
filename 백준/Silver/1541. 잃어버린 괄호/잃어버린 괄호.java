import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr1 = input.split("-");
        
        int result = 0;
        for(int i = 0; i < arr1.length; i++) {
            String[] arr2 = arr1[i].split("\\+");
            
            int sum = 0;
            for(String num : arr2) {
                sum += Integer.parseInt(num);
            }
            
            if(i == 0) result += sum;
            else result -= sum;
        }
        
        System.out.print(result);
    }
}