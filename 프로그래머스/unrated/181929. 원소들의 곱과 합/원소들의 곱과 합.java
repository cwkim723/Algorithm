import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int multiply = 1;
        int add = 0;
        
        for(int num : num_list) {
            multiply *= num;
        }
        for(int num : num_list) {
            add += num;
        }
        
        return multiply < Math.pow(add, 2) ? 1 : 0;
    }
}