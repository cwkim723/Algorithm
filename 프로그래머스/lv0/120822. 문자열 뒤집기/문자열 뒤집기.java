class Solution {
    public StringBuilder solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for(int i = my_string.length()-1; i >= 0; i--) {
            answer.append(my_string.charAt(i));
        }
        return answer;
    }
}