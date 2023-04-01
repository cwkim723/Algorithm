class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int sumDays = b;
        
        if(a > 1) {
            for(int i = 2; i <= a; i++) {
                sumDays += getDays(i);
            }
        }
        
        switch(sumDays % 7) {
            case 1: answer = "FRI"; break;
            case 2: answer = "SAT"; break;
            case 3: answer = "SUN"; break;
            case 4: answer = "MON"; break;
            case 5: answer = "TUE"; break;
            case 6: answer = "WED"; break;
            case 0: answer = "THU"; break;
        }
        
        return answer;
    }
    
    int getDays(int month) {
        int days = 0;
        switch(month) {
            case 2: days = 31; break;
            case 3: days = 29; break;
            case 4: days = 31; break;
            case 5: days = 30; break;
            case 6: days = 31; break;
            case 7: days = 30; break;
            case 8: days = 31; break;
            case 9: days = 31; break;
            case 10: days = 30; break;
            case 11: days = 31; break;
            case 12: days = 30; break;
        }
        
        return days;
    }
}