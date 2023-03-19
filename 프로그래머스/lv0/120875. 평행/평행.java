import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        Arrays.sort(dots, (o1,o2) -> (o1[0] == o2[0] ?  o1[0] - o2[0] : o1[1] - o2[1]));
        double m1 = (double)(dots[1][1] - dots[0][1]) / (dots[1][0] - dots[0][0]);
        double m2 = (double)(dots[3][1] - dots[2][1]) / (dots[3][0] - dots[2][0]);
        
        if(m1 == m2) {
            answer = 1;
        }
        return answer;
    }
}