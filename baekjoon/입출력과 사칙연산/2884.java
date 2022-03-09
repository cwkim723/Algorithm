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

        if(h == 0) h = 24;

        int time = (60*h + m) - 45;

        int htime = time / 60;
        int mtime = time % 60;

        if (htime == 24) htime = 0;

        System.out.print(htime + " " + mtime);
    }
}