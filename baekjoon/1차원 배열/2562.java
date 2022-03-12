package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int index = 0;
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index+1);
    }
}