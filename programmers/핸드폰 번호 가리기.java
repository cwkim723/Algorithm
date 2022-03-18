package String;

import java.util.Arrays;

class Solution {
    public String solution(String phone_number) {
        String answer = "";

        for(int i = 0; i < phone_number.length() - 4; i++){
            answer += "*";
            // 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린다.
        }

        answer += phone_number.substring(phone_number.length() - 4); // 전화번호의 뒷 4자리를 substring로 잘라 answer에 붙인다.

        return answer;
    }
}

class Solution2 {
    public String solution(String phone_number) {
        char[] ch = phone_number.toCharArray(); // 휴대폰 번호를 잘라 char 배열에 넣는다.

        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*'; // 뒷자리 4자리를 제외하고 모두 *으로 바꾼다.
        }

        System.out.println("Arrays.toString(ch) = " + Arrays.toString(ch)); // 뒷자리 4자리를 제외하고 모두 *으로 치환됨
        // Arrays.toString(ch) = [*, *, *, *, *, 8, 8, 8, 8]

        System.out.println("String.valueOf(ch) = " + String.valueOf(ch)); // 배열이 String 형태로 변환됨.
        // String.valueOf(ch) = *****8888

        return String.valueOf(ch);
    }
}

