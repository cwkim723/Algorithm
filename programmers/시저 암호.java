package String;

class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for(int i = 0; i < s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                if((s.charAt(i) + n) > 90){
                    answer += (char)(s.charAt(i) + n - 26);
                } else {
                    answer += (char)(s.charAt(i) + n);
                }
            } else if(Character.isLowerCase(s.charAt(i))) {
                if((s.charAt(i) + n) > 122){
                    answer += (char)(s.charAt(i) + n - 26);
                } else {
                    answer += (char)(s.charAt(i) + n);
                }
            } else {
                answer += " ";
            }
        }

        return answer;
    }
}