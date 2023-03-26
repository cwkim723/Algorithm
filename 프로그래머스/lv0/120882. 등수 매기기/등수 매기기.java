import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Double avgScore[] = new Double[score.length];
        Double SortAvgScore[] = new Double[score.length];
        
        for(int i = 0; i < score.length; i++) {
            avgScore[i] = Double.valueOf((score[i][0] + score[i][1]) / 2.0);
        }
        for (int i = 0; i < avgScore.length; i++) {
            SortAvgScore[i] = Double.valueOf(avgScore[i]);
        }
        
        Arrays.sort(SortAvgScore, Collections.reverseOrder());
        
        List<Double> list = Arrays.asList(SortAvgScore);
        
        for(int i = 0; i < avgScore.length; i++) {
            answer[i] = list.indexOf(avgScore[i]) + 1;
        }
        
        return answer;
    }
}