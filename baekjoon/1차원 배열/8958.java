package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i = 0; i < a; i++){
            String str = br.readLine();
            calc(str);
        }
    }

    static void calc(String str){
        char[] arr = new char[str.length()];

        int count = 1;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = str.toUpperCase().charAt(i);
        }

        char answer = ' ';
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'O'){
                // 맞은 경우
                if(answer == arr[i]){
                    // 연속으로 맞은 경우
                    count++;
                    sum += count;
                } else {
                    // 연속 X 경우
                    count = 1;
                    sum += count;
                }
            } else {
                // 틀린 경우 : count를 1로 초기화시킴
                count = 1;
            }

            answer = arr[i];

        }
        System.out.println(sum);
    }
}