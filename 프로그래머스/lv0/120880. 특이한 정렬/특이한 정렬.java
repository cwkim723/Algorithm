import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int gap = 10000; // 차이
        int number = 0; // 정렬 대상
        int index = 0; // 정렬 대상의 인덱스
        
        for(int i = 0; i < numlist.length; i++) {
            for(int j = 0; j < numlist.length; j++) {
                int num = numlist[j];
                if(num == -1) continue;
                
                int abs = Math.abs(num - n);
                if(abs < gap) {
                    gap = abs;
                    number = num;
                    index = j;
                } else if((abs == gap) && number < num) {
                    number = num;
                    index = j;
                }
            }
            
            answer[i] = number;
            numlist[index] = -1;
            gap = 10000;
            number = 0;
            index = 0;
        }
        
        return answer;
    }
}