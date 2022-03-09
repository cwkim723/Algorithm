package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] dice = str.split(" ");
        int a = Integer.parseInt(dice[0]);
        int b = Integer.parseInt(dice[1]);
        int c = Integer.parseInt(dice[2]);

        if(a == b && a == c && b == c){
            System.out.println(10000 + (a * 1000));
        }else if(a == b && a != c){
            System.out.println(1000 + (a * 100));
        }else if(a == c && b != c){
            System.out.println(1000 + (a * 100));
        }else if(b == c && a != c){
            System.out.println(1000 + (b * 100));
        } else {
            int max = Math.max(Math.max(a, b), c);
            System.out.println(max * 100);
        }
    }
}