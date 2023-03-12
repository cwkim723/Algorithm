import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] integerArr = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        List<Integer> list = Arrays.asList(integerArr);
        Collections.sort(list, Collections.reverseOrder());
        
        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < list.size(); j++) {
                if(emergency[i] == list.get(j)) {
                    answer[i] = j + 1;
                }
            }
        }
        
        return answer;
    }
}