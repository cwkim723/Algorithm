import java.util.*;

class Solution {
    public String solution(String s) {
        Map<String, String> map = new HashMap<>();
        Map<String, String> strMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            String str = String.valueOf(s.charAt(i));
            if(map.get(str) == null) {
                map.put(str, str);
                strMap.put(str, str);
            } else {
                strMap.remove(str);
            }
        }
        String[] arr = new String[strMap.size()];
        
        int index = 0;
        for(String str : strMap.keySet()) {
            arr[index] = str;
            index++;
        }
        
        Arrays.sort(arr);
        
        return String.join("", arr);
    }
}