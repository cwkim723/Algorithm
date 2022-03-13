package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            String[] arr = br.readLine().split(" ");
            calc(arr);
        }
    }

    static void calc(String[] arr){
        int people = Integer.parseInt(arr[0]);
        int[] intArr = new int[people];
        double sum = 0;
        int count = 0;
        double answer = 0;

        for(int i = 0; i < intArr.length; i++){
            intArr[i] = Integer.parseInt(arr[i+1]);
            sum += Integer.parseInt(arr[i+1]);
        }

        double avg = sum / people;

        for(int i = 0; i < intArr.length; i++){
            if(avg < intArr[i]) count++;
        }

        System.out.println(String.format("%.3f", ((double)count/people) * 100) + "%");
    }

}