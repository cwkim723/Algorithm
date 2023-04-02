class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pInt = Long.parseLong(p);
        for(int i = 0; i <= t.length()-p.length(); i++) {
            String numStr = t.substring(i, i+p.length());
            long num = Long.parseLong(numStr);
            if(num <= pInt) {
                answer++;
            }
        }
        return answer;
    }
}