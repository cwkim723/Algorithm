class Solution {
    int sum = 0;
    
    public int solution(int n) {
        if(n % 2 == 1) {
            n = n - 1;
        }
        return recursion(n);
    }
    
    int recursion(int m) {
        if(m < 2) {
            return sum;
        } else {
            sum += m;
            return recursion(m-2);
        }
    }
}