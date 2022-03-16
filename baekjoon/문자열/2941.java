package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] wordArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int count = 0;

        for(int i = 0; i < wordArr.length; i++) {
            if(str.contains(wordArr[i])) {
                count++;
                str = str.replace(wordArr[i], ".");
            }
        }

        System.out.println(str.length());
    }
}