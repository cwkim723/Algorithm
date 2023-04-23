class Solution {
    public long solution(long n) {
        long answer = -1L;
        long sqrt = (long)Math.sqrt(n);
        if(n == sqrt*sqrt) {
            answer = (sqrt+1) * (sqrt+1);
        } 
        return answer;
    }
}