package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String num1 = "";
        int intNum1 = Integer.parseInt(str[0]);
        while(intNum1 != 0){
            num1 += intNum1 % 10;
            intNum1 = intNum1 / 10;
        }
        String num2 = "";
        int intNum2 = Integer.parseInt(str[1]);
        while(intNum2 != 0){
            num2 += intNum2 % 10;
            intNum2 = intNum2 / 10;
        }

        System.out.println(Math.max(Integer.parseInt(num1), Integer.parseInt(num2)));
    }
}