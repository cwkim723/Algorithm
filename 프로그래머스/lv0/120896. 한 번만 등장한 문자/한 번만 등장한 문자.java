import java.util.*;

class Solution {
    public String solution(String s) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            String str = String.valueOf(s.charAt(i));
            if(map.get(str) == null) {
                map.put(str, 1);
            } else {
                map.put(str, map.get(str) + 1);
            }
        }
        
        for(String key : map.keySet()) {
            if(map.get(key) == 1) list.add(key);
        }
        
        Collections.sort(list);
        
        return String.join("", list);
    }
}