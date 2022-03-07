package String;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = b;

        while(num != 0){
            System.out.println(a * (num % 10));
            num /= 10;
        }

        System.out.println(a * b);
    }
}