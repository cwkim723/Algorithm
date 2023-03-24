class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int num = 0;
        
        String[] arr = polynomial.split(" \\+ ");
        
        for(String str : arr) {
            if(str.contains("x")) {
                str = str.replace("x", "");
                if(str.equals("")) {
                    str = "1";
                }
                x += Integer.parseInt(str);
            } else {
                num += Integer.parseInt(str);
            }
        }
        
        if(num != 0) {
            if(x != 0) answer = x + "x + " + num;
            if(x == 1) answer = "x + " + num;
            if(x == 0) answer = num + "";
        } else {
            if(x != 0) answer = x + "x";
            if(x == 1) answer = "x";
            if(x == 0) answer = "0";
        }
        
        return answer;
    }
}