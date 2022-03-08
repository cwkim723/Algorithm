package String;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int min = arr[0];

        // 제일 작은 수 뽑아내기
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }

        // 제일 작은 수 제거하고 list에 담기
        for(int i = 0; i < arr.length; i++){
            if(arr.length == 1){
                list.add(arr[i]);
            } else {
                if(arr[i] != min){
                    list.add(arr[i]);
                }
            }
        }

        int[] answer = new int[list.size()];

        // list를 answer 배열에 옮겨담기
        if(list.size() == 1){
            answer[0] = -1;
        } else {
            for(int i = 0; i < list.size(); i++){
                answer[i] = list.get(i);
            }
        }

        return answer;
    }
}
