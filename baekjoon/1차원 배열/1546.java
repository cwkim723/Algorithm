package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int max = 0;
        int[] intArr = new int[str.length];
        double sum = 0;

        for(int i = 0; i < str.length; i++){
            if(max < Integer.parseInt(str[i])) max = Integer.parseInt(str[i]);
        }

        for(int i = 0; i < str.length; i++){
            double score = Integer.parseInt(str[i]);
            sum += score/max*100;
        }

        System.out.println(sum / a);
    }
}