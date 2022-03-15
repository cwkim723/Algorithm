package String;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");

        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                if (count % 2 == 1) {
                    answer += Character.toLowerCase(s.charAt(i));
                } else {
                    answer += Character.toUpperCase(s.charAt(i));
                }
                count++;
            } else {
                answer += " ";
                count = 0;
            }
        }
        return answer;
    }
}