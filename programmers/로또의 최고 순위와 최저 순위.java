package String;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zeroCount = 0;
        
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0){
                zeroCount++;
            }
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    count++;
                } 
            }
        }
        
        int a = calc(count);
        int b = calc(count+zeroCount);
        
        answer[1] = a;
        answer[0] = b;
        

        return answer;
    }
    
    static int calc(int count){
        int win = 7 - count;
        if(win == 7) win = 6;
        
        return win;
    }
}