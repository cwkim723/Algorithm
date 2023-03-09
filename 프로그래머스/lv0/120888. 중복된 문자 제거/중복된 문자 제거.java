import java.util.*;

class Solution {
    public StringBuilder solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        Map<String, String> map = new HashMap<>();
        String[] arr = my_string.split("");
        for(String str : arr) {
            if(map.get(str) == null) {
                map.put(str, str);
                sb.append(str);
            }
        }
        return sb;
    }
}