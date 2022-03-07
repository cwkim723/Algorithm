package String;

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

        if(a > b){
            answer[1] = a;
            answer[0] = b;
        } else {
            answer[1] = b;
            answer[0] = a;
        }


        return answer;
    }

    static int calc(int count){
        int num = 0;
        switch(count){
            case 0: num = 6; break;
            case 1: num = 6; break;
            case 2: num = 5; break;
            case 3: num = 4; break;
            case 4: num = 3; break;
            case 5: num = 2; break;
            case 6: num = 1; break;
        }

        return num;
    }
}