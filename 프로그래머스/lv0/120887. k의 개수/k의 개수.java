class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int m = i; m <= j; m++) {
            String num = String.valueOf(m);
            for(int index = 0; index < num.length(); index++) {
                if(k == Character.getNumericValue(num.charAt(index))) {
                    answer++;
                }
            }
        }
        return answer;
    }
}