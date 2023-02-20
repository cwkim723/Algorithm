class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] arr = Integer.toString(order).split("");
        
        for(String num : arr) {
            switch(num) {
                case "3": answer++; break;
                case "6": answer++; break;
                case "9": answer++; break;
            }
        }
        return answer;
    }
}