import java.io.*;
import java.util.*;



public class Main {
    static void solve(int n) {
        int ret;
        int i = 0;
        for(int prev=0; true; prev++) {
            if(prev % 10 != 6) {
                i++;
                ret = prev * 1000;
                ret += 666;
                if(i == n) {
                    System.out.print(ret);
                    return;
                }
            } else if (prev % 100 / 10 != 6) {
                for(int post = 0; post < 10; post++) {
                    i++;
                    ret = prev * 1000;
                    ret += 660;
                    ret += post;
                    if(i == n) {
                        System.out.print(ret);
                        return;
                    }
                }
            } else if(prev % 1000 / 100 !=6 ) {
                for(int post = 0; post < 100; post++) {
                    i++;
                    ret = 1000 * prev;
                    ret += 600;
                    ret += post;
                    if(i == n ) {
                        System.out.print(ret);
                        return;
                    }
                }
            } else if(prev % 10000/ 1000 != 6) {
                for(int post = 0; post < 1000; post++) {
                    i++;
                    ret = 1000 * prev;
                    ret += post;
                    if(i==n) {
                        System.out.print(ret);
                        return;
                    }
                }
            }
        }
    }
        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int tcase = Integer.parseInt(br.readLine());
        solve(tcase);
       
    }
}