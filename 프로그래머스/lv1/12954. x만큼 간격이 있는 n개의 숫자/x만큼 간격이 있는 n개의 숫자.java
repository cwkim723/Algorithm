class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int index = 0;
        for(long i = 1; i <= n; i++) {
            answer[index] = x*i;
            index++;
        }
        return answer;
    }
}