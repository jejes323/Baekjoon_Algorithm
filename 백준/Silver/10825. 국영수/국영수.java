import java.io.*;
import java.util.*;


class Person {
    String name;
    int kor;
    int eng;
    int math;
    
    Person(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math; 
    }
    
}
public class Main { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int tcase = Integer.parseInt(br.readLine());
        Person[] arr = new Person[tcase];
        
        for(int i = 0; i < tcase; i++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            
            arr[i] = new Person(a, b, c, d);
        }
        
        Arrays.sort(arr, (a, b) -> {
            if(a.kor != b.kor) return b.kor - a.kor;
            if(a.eng != b.eng) return a.eng - b.eng;
            if(a.math != b.math) return b.math - a.math;
            return a.name.compareTo(b.name);
        });
        
        StringBuilder sb = new StringBuilder();
        for(Person p : arr) {
            sb.append(p.name).append('\n');
        }
        
        System.out.print(sb);
    }
}