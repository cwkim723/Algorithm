package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        int[] arr = new int[n];
        int answer = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = arr.length - 1; i >= 0; i--){
            if(k / arr[i] > 0){
                answer += (k / arr[i]);
                k = k % arr[i];
            }
        }

        System.out.println(answer);
    }
}
