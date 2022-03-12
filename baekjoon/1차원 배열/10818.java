package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        int[] intArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            intArr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(intArr);
        int min = intArr[0];
        int max = intArr[intArr.length - 1];

        System.out.println(min + " " + max);
    }
}