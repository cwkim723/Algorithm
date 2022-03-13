package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] intArr = new int[n][2];
        int[] answer = new int[intArr.length];

        for(int i = 0; i < n; i++){
            String[] str = br.readLine().split(" ");
            intArr[i][0] = Integer.parseInt(str[0]);
            intArr[i][1] = Integer.parseInt(str[1]);
        }

        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(intArr[i][0] < intArr[j][0] && intArr[i][1] < intArr[j][1]){
                    count++;
                }
            }
            answer[i] = count + 1;
        }

        for(int i = 0; i < n; i++){
            System.out.print(answer[i] + " ");
        }
    }

}