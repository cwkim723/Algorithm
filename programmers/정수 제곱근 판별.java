package String;

class Solution {
    public long solution(long n) {
        long answer = -1;
        long num = (long)Math.sqrt(n);

        if(num * num == n) return (num + 1) * (num + 1);

        return answer;
    }

}