package String;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i = 1; i <= t; i++){
            String[] str = br.readLine().split(" ");
            int num1 = Integer.parseInt(str[0]);
            int num2 = Integer.parseInt(str[1]);
            int sum = num1 + num2;
            bw.write("Case #" + i + ": " + num1 + " + " + num2 + " = " + sum +"\n");
        }

        bw.flush();
        bw.close();
    }
}