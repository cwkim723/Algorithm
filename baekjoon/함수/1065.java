package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = n;

        if(n >= 100){
            for(int i = 100; i <= n; i++){
                int[] arr = calc(i);

                int gap = arr[0] - arr[1];
                for(int j = 0; j < arr.length - 1; j++){
                    if(arr[j] - arr[j+1] != gap){
                        count--;
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }

    static int[] calc(int num){
        int[] arr = new int[(int)Math.log10(num)+1];

        for(int i = arr.length - 1; i >= 0; i--){
            arr[i] = num % 10;
            num = num / 10;
        }

        return arr;
    }

}