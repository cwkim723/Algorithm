class Solution {
    public int solution(int num) {
        int answer = 0;
        while(true) {
            if(num == 1) break;
            if(answer == 500) {
                answer = -1;
                break;
            }
            answer++;
            if(num % 2 == 0) {
                num = even(num);
            } else if(num % 2 == 1) {
                num = odd(num);
            }
        }
        return answer;
    }
    
    int even(int num) {
        return num / 2;
    }
    
    int odd(int num) {
        return (num * 3) + 1;
    }
}