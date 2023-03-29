import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i = 0; i < answers.length; i++) {
            if(person1[i%5] == answers[i]) {
                grade1++;
            }
            if(person2[i%8] == answers[i]) {
                grade2++;
            }
            if(person3[i%10] == answers[i]) {
                grade3++;
            }
        }
        
        int max = Math.max(grade1, grade2);
        max = Math.max(max, grade3);
        
        if(grade1 == max) answer.add(1);
        if(grade2 == max) answer.add(2);
        if(grade3 == max) answer.add(3);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}