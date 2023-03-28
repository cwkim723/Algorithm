import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int same = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : win_nums) {
            map.put(num, num);
        }
        
        for(int lotto : lottos) {
            if(lotto == 0) {
                zeroCount++;
                continue;
            }
            if(map.get(lotto) != null) {
                same++;
            }
        }
        
        answer[0] = grade(zeroCount + same);
        answer[1] = grade(same);
        
        return answer;
    }
    
    int grade(int sum) {
        int grade;
        if(sum <= 1) {
            grade = 6;
        } else {
            grade = 7 - sum;
        }
        
        return grade;
    }
}