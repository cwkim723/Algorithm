import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        Arrays.sort(lines, (o1,o2) -> (o1[0] == o2[0] ?  o1[1] - o2[1] : o1[0] - o2[0]));
        System.out.println(Arrays.deepToString(lines));
        
        int[] range = new int[201];
        for(int[] line : lines) {;
            for(int i = line[0]; i < line[1]; i++) {
                int a = i + 100;
                range[a]++;
                if(range[a] == 2) {
                    answer = answer+1;
                }
            }
        }
        
        return answer;
    }
}