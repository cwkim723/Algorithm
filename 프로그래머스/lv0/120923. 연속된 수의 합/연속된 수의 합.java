import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        List<Integer> list = new ArrayList<>();
        int share = total / num;
        list.add(share);
        
        int sum = share;
        
        for(int i = 1; i <= ((num - 1) / 2); i++) {
            sum+=(share+i);
            sum+=(share-i);
            list.add(share+i);
            list.add(share-i);
        }
        
        if((num - 1) % 2 != 0) {
            list.add(total - sum);
        }
        
        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}