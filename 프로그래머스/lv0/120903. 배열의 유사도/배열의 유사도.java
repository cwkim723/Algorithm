import java.util.Arrays;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        int max = Math.max(s1.length, s2.length);   
        int min = Math.min(s1.length, s2.length);
        
        if(s2.length > s1.length) {
            for(int i = 0; i < min; i++) {
                for(int j = 0; j < max; j++) {
                    if(s1[i].equals(s2[j])) {
                        answer++;
                    }
                }
            }
        } else {
            for(int i = 0; i < min; i++) {
                for(int j = 0; j < max; j++) {
                    if(s2[i].equals(s1[j])) {
                        answer++;
                    }
                }
            }
        }
        
        
        return answer;
    }
}