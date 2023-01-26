class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pInt = Long.parseLong(p);
        int pLength = p.length();
        for(int i = 0; i <= t.length()-pLength; i++) {
            long target = Long.parseLong(t.substring(i, i+pLength));
            if(target <= pInt) answer++;
        }
        return answer;
    }
}