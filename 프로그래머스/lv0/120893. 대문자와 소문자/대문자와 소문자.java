class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(Character.isUpperCase(ch)) {
                sb.append(String.valueOf(ch).toLowerCase());
            } else {
                sb.append(String.valueOf(ch).toUpperCase());
            }
        }
        return sb.toString();
    }
}