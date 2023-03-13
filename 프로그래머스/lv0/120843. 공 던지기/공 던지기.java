class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;
        int max = numbers.length; // 6
        for(int count = 1; count <= k; count++) {
            if(count == k) {
                answer = numbers[index];
                break;
            }
            
            if(index + 2 < max) {
                index = index + 2;
            } else {
                index = index + 2 - max;
            }
        }
        return answer;
    }
}