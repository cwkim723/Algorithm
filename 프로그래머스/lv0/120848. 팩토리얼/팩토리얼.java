class Solution {
    public int solution(int n) {
        int answer = 1;
        int sum = 1;
        for(int i = 1; i <= n; i++) {
            if(sum * i <= n) {
                sum = sum * i;
                answer = i;
            } else {
                break;
            }
        }
        return answer;
    }
}