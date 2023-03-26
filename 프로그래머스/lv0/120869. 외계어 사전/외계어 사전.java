class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for(String word : dic) {
            int count = 0;
            for(int j = 0; j < spell.length; j++) {
                int index = word.indexOf(spell[j]);
                if(word.indexOf(spell[j]) != -1) {
                    count++;
                }
            }
            if(count == word.length() && spell.length == word.length()) {
                return 1;
            }
        }
        
        return 2;
    }
}