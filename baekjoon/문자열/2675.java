package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());

        for(int i = 0; i < caseNum; i++){ // 3 ABC
            String[] str = br.readLine().split(" ");
            int repeatNum = Integer.parseInt(str[0]);

            System.out.println(calc(str[1], repeatNum));
        }

    }

    static String calc(String s, int repeatNum) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < repeatNum; j++){
                answer += s.charAt(i);
            }
        }

        return answer;
    }

}