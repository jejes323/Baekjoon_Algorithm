import java.io.*;
import java.util.*;
class Person {
    int age;
    String name;
    
    Person(int age, String name) {
        this.age = age;
        this.name = name; 
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        
        Person arr[] = new Person[tcase];
        
        for(int i = 0; i < tcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            
            arr[i] = new Person(a, s);
        }
        
        Arrays.sort(arr, (a, b) -> a.age - b.age);
        
        StringBuilder sb = new StringBuilder();
        for(Person p : arr) {
            sb.append(p.age).append(" ").append(p.name).append('\n');
        }
        
        System.out.println(sb);
    }
}