package String;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] first = br.readLine().split(" ");
        int a = Integer.parseInt(first[0]);
        int b = Integer.parseInt(first[1]);
        while(a != 0 && b != 0){
            bw.write(a+b + "\n");

            first = br.readLine().split(" ");
            a = Integer.parseInt(first[0]);
            b = Integer.parseInt(first[1]);
        }

        bw.flush();
        bw.close();
    }
}