class Solution {
    boolean solution(String s) {
        String pStr = s.toLowerCase();
        String yStr = s.toLowerCase();
        
        pStr = pStr.replace("p", "");
        yStr = yStr.replace("y", "");

        return pStr.length() == yStr.length();
    }
}