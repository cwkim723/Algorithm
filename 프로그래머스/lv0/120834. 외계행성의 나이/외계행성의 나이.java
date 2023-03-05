class Solution {
    public String solution(int age) {
        String answer = "";
        char[] ageArr = {'a','b','c','d','e','f','g','h','i','j'};
        String[] arr = String.valueOf(age).split("");
        for(String strNum : arr) {
            int num = Integer.parseInt(strNum);
            answer += String.valueOf(ageArr[num]);
        }
        return answer;
    }
}