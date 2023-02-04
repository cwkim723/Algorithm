class Solution {
    public int[] solution(int money) {
        int coffee = money / 5500;
        int[] answer = {coffee, money - coffee*5500};
        return answer;
    }
}