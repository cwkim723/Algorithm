import java.util.*;

class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        char strArr[] = my_string.toCharArray();
        Arrays.sort(strArr);
        
        for(char str : strArr) {
            if(Character.isDigit(str)) {
                list.add(Character.getNumericValue(str));
            }
        }
        
        return list;
    }
}