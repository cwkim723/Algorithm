class Solution {
    public int solution(int n) {
        int answer = 2;
        int num = (int) Math.sqrt(n * 1.0);
        
        if(num*num == n) {
            answer = 1;
        }
        return answer;
    }
}