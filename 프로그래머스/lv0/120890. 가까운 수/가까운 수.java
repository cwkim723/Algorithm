import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int gap = 100;
        Arrays.sort(array);
        for(int num : array) {
            int numGap = Math.abs(num - n);
            if(gap > numGap) {
                gap = numGap;
                answer = num;
            }
        }
        return answer;
    }
}