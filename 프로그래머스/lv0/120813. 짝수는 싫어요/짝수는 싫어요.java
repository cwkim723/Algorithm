class Solution {
    public int[] solution(int n) {
        double count = Math.round(n / 2.0);
        int[] answer = new int[(int)count];
        
        int odd = 1;
        for(int i = 0; i < count; i++) {
            answer[i] = odd;
            odd+=2;
        }
        return answer;
    }
}