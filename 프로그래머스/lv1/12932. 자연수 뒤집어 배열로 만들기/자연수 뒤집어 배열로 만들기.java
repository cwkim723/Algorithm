class Solution {
    public int[] solution(long n) {
        String[] str = String.valueOf(n).split("");
        int[] answer = new int[str.length];
        for(int i = 0; i < str.length; i++) {
            answer[str.length-1-i] = Integer.parseInt(str[i]);
        }
        return answer;
    }
}