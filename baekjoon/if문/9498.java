package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());

        if(score >= 90) System.out.println("A");
        if(score < 90 && score >= 80) System.out.println("B");
        if(score < 80 && score >= 70) System.out.println("C");
        if(score < 70 && score >= 60) System.out.println("D");
        if(score < 60) System.out.println("F");

    }
}