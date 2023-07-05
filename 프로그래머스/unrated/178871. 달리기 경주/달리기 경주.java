import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        String temp = "";
        for(String call : callings) {
            int index = map.get(call);
            temp = players[index-1];
            players[index-1] = call;
            players[index] = temp;
            map.put(temp, index);
            map.put(call, index-1);
        }
        
        return players;
    }
}