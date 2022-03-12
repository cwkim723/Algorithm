package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int num = a*b*c;
        int[] count = new int[10];

        int size = (int)(Math.log10(num)+1);
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = (num / (int)Math.pow(10.0, (double)size-(i+1))) % 10;
        }

        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        for(int i = 0; i < count.length; i++){
            System.out.println(count[i]);
        }
    }
}