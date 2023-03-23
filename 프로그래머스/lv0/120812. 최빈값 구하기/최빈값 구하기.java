import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : array) {
            int value = map.get(num) == null ? 1 : map.get(num) + 1;
            map.put(num, value);
        }
        
		List<Integer> mapList = new ArrayList<Integer>(map.keySet());
        
        Collections.sort(mapList, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));
        
        int count = 0;
        
		for(Integer key : mapList) {
            if(count == map.get(key)) return -1;
            if(count < map.get(key)) {
                count = map.get(key);
                answer = key;
            }
		}
        
        return answer;
    }
}