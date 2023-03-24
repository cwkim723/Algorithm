class Solution {
    public int solution(int n) {
        int x = 1;
        int count = 0;
        
        while(true) {
            x = x3(x);
            count = count + 1;
            if(count == n) break;
            x = x + 1;
        }
        
        return x;
    }
    
    int x3(int x) {
        if(x % 3 == 0 || String.valueOf(x).contains("3")) {
            x = x + 1;
            return x3(x);
        } else {
            return x;
        }
    }
}