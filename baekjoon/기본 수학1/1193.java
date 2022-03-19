package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int line = 0; // 몇 번째 줄인지.
        while(line*(line+1)/2 < x){
            line++;
        }

        int prev = (line - 1)*line/2; // 해당 라인이 몇 번째 수까지 존재하는지.

        if(line % 2 == 0){ // 짝수라면
            int top = x - prev;
            int bottom = line+1 - (top);
            System.out.println(top + "/" + bottom);
        } else {
            int bottom = x - prev;
            int top = line+1 - (bottom);
            System.out.println(top + "/" + bottom);
        }

    }
}