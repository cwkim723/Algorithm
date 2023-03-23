class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int num1 = Integer.parseInt(arr[0]);
            int num2 = Integer.parseInt(arr[2]);
            int result = 0;
            
            if(arr[1].equals("-")) {
                result = (num1 - num2);
            } else {
                result = num1 + num2;
            }
            
            if(result == Integer.parseInt(arr[4])) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        
        return answer;
    }
}