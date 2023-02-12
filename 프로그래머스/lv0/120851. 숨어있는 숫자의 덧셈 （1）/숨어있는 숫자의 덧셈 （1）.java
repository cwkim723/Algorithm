class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split("");
        for(String str : strArr) {
            boolean check = str.matches("-?\\d+");
            if(check) answer += Integer.parseInt(str);
        }
        return answer;
    }
}