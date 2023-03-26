class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        // 가장 긴 변이 주어진 경우
        int sum = sides[0] + sides[1];
        int max = Math.max(sides[0], sides[1]);
        for(int i = (2*max - sum); i < max; i++) {
            answer++;
        }
        
        // 가장 긴 변이 주어지지 않은 경우
        for(int i = max+1; i < sum; i++) {
            answer++;
        }
        
        return answer;
    }
}