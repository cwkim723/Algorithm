import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        Arrays.sort(dots, (o1, o2) -> {
            return o1[0]-o2[0];
        });
        System.out.println(Arrays.deepToString(dots));
        return Math.abs(dots[0][1] - dots[1][1]) * Math.abs(dots[0][0] - dots[2][0]);
    }
}