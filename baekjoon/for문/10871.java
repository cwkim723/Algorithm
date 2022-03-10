package String;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] first = br.readLine().split(" ");
        int n = Integer.parseInt(first[0]);
        int x = Integer.parseInt(first[1]);
        String[] second = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            if(Integer.parseInt(second[i]) < x) System.out.print(Integer.parseInt(second[i]) + " ");;
        }

        bw.flush();
        bw.close();
    }
}