class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length() == 4 || s.length() == 6) {
            String pattern = "\\d+";
            answer = s.matches(pattern);
         }
        return answer;
    }
}