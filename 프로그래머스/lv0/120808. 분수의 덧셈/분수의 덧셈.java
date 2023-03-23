class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int a = numer1 * denom2 + numer2 * denom1;
        int b = denom1 * denom2;
        
        int gcd = gcd(a, b);
        answer[0] = a / gcd;
        answer[1] = b / gcd;
        
        return answer;
    }
    
    int gcd(int a, int b) {
		if(a % b == 0) {
			return b;
		}
        
		return gcd(b, a % b);
	}
}