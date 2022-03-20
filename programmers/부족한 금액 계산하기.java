package String;

class Solution {
    public long solution(long price, long money, long count) {
        long answer = price * (count * (count + 1) / 2) - money;

        return (answer <= 0) ? 0 : answer;
    }
}
