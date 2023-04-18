import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String strNum = String.valueOf(n);
        for(int i = 0; i < strNum.length(); i++) {
            answer += Character.getNumericValue(strNum.charAt(i));
        }

        return answer;
    }
}