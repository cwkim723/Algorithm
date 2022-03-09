package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] hm = str.split(" ");
        int h = Integer.parseInt(hm[0]);
        int m = Integer.parseInt(hm[1]);
        int c = Integer.parseInt(br.readLine());

        m = m + c;
        if(m >= 60) {
            h += (m / 60);
            m = m % 60;
        }

        if (h >= 24) h -= 24;

        System.out.print(h + " " + m);
    }
}