class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for(String input : keyinput) {
            if(input.equals("up")) {
                if(Math.abs(answer[1] + 1) > (board[1] / 2)) continue;
                answer[1] = answer[1] + 1;
            } else if (input.equals("down")) {
                if(Math.abs(answer[1] - 1) > (board[1] / 2)) continue;
                answer[1] = answer[1] - 1;
            } else if (input.equals("left")) {
                if(Math.abs(answer[0] - 1) > (board[0] / 2)) continue;
                answer[0] = answer[0] - 1;
            } else if (input.equals("right")) {
                if(Math.abs(answer[0] + 1) > (board[0] / 2)) continue;
                answer[0] = answer[0] + 1;
            }
        }
        return answer;
    }
}