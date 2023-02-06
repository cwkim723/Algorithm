class Solution {
    public int solution(int[] sides) {
        int sum = sides[0] + sides[1] + sides[2];
        int max = Math.max(sides[0], sides[1]);
        max = Math.max(max, sides[2]);
        if(max >= sum - max) {
            return 2;
        } else {
            return 1;
        } 
    }
}