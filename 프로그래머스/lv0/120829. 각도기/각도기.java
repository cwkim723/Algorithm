class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(angle <= 90) {
            answer = (angle < 90) ? 1 : 2;
        } else {
            answer = (angle < 180) ? 3 : 4;
        }
        return answer;
    }
}