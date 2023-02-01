class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] sentence = {"aya", "ye", "woo", "ma"};
        String[] sentences = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for(String babble : babbling) {
            for(String sent : sentences) {
                babble = babble.replace(sent, "?");
            }
            for(String sen : sentence) {
                babble = babble.replace(sen, "?");
            }
            
            babble = babble.replace("?", "");
            if(babble.equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}