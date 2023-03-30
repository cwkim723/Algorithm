class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n == 1) return answer;
        
        for(int i = 2; i <= n; i++) {
			if(IsPrimeNumber(i) == true) {
                answer++;
            }
		}
        
        return answer;
    }
    
    public static boolean IsPrimeNumber(int number) {
        double sqrtNumber = Math.sqrt(number);
        for(int i = 2; i <= sqrtNumber; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}