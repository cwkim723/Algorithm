class Solution {
    public int solution(int a, int b) {
        int gcd = gcd(a, b);
        a = a / gcd;
        b = b / gcd;
        
        if(1000 % (1000.0 / b) != 0.0) {
            return 2;
        }
        
        return 1;
    }
    
    int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }

        return gcd(b, (a % b));
    }
}