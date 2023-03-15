import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String reStr = my_string.replaceAll("[a-zA-Z]", " ");
        String[] arr = reStr.split(" ");
        
        if(reStr.replaceAll(" ", "") == "") {
            return 0;  
        } 
        
        for(String str : arr) {
            str = str.trim();
            if(str.equals("")) continue;
            answer += Integer.parseInt(str);
        }
        return answer;
    }
}