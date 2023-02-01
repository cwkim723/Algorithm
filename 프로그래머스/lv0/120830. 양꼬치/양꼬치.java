class Solution {
    public int solution(int n, int k) {
        int sum = 12000*n + 2000*k;
        if(n >= 10) {
            sum = sum - (n / 10) * 2000;
        }
        return sum;
    }
}