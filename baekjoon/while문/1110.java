package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int temp = n;
        int count = 0;
        while(true){
            temp = (temp % 10) * 10 + (temp / 10 + temp % 10) % 10;
            count++;
            if(n == temp) break;
        }

        System.out.println(count);
    }
}