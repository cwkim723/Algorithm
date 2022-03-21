package String;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int[][] arr = new int[right-left + 1][2];

        int k = 0;
        for(int i = left; i <= right; i++){
            int count = 0;
            arr[k][0] = i;
            for(int j = 1; j <= i; j++){
                if(i % j == 0) {
                    count++;
                }
            }
            arr[k][1] = count;
            k++;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i][1] % 2 == 0) {
                answer += arr[i][0];
            } else {
                answer -= arr[i][0];
            }
        }

        return answer;
    }
}
