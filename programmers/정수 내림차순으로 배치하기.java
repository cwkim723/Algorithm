package String;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String answer = "";
        String temp = Long.toString(n);
        Character[] longArr = new Character[temp.length()];

        for(int i = 0; i < longArr.length; i++){
            longArr[i] = temp.charAt(i);
        }

        Arrays.sort(longArr, Collections.reverseOrder());
        System.out.println(Arrays.toString(longArr));

        for(char ln : longArr){
            answer += ln;
        }

        System.out.println("answer = " + answer);

        return Long.parseLong(answer);
    }
}