class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        StringBuilder sb = new StringBuilder(after);
        
        for(int i = 0; i < before.length(); i++) {
            String ch = String.valueOf(before.charAt(i));
            int index = sb.indexOf(ch);
            
            if(index != -1) {
                sb.setCharAt(index, '1');
            } else {
                answer = 0;
                break;
            }
        }
        return answer;
    }
}