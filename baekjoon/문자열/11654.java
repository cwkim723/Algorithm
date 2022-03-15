package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char n = br.readLine().charAt(0);
        int ascii = (int)n;

        System.out.println(ascii);
    }
}