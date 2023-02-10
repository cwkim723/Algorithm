class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] str = Integer.toString(n).split("");
        for(String strNum : str) {
            answer += Integer.parseInt(strNum);
        }
        return answer;
    }
}