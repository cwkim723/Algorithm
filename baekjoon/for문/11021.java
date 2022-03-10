package String;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i = 1; i <= t; i++){
            String[] str = br.readLine().split(" ");
            int sum = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
            bw.write("Case #" + i + ": " + sum +"\n");
        }

        bw.flush();
        bw.close();
    }
}