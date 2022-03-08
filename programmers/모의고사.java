package String;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int count1 = 0; int count2 = 0; int count3 = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < answers.length; i++){
            if(person1[i % 5] == answers[i]) count1++;
            if(person2[i % 8] == answers[i]) count2++;
            if(person3[i % 10] == answers[i]) count3++;
        }

        int max = Math.max(Math.max(count1, count2), count3);

        if(count1 == max) list.add(1);
        if(count2 == max) list.add(2);
        if(count3 == max) list.add(3);

        int[] answer = new int[list.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }


        return answer;
    }
}
