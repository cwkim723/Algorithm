import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        
        for(String str : arr) {
            str = str.trim();
            if(str.equals("")) continue;
            answer += Integer.parseInt(str);
        }
        return answer;
    }
}