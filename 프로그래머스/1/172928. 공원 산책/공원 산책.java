import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int width = park[0].length() - 1; // 가로
        int height = park.length - 1; // 세로
        String[][] parkArr = new String[park.length][park[0].length()];
        for(int i = 0; i < park.length; i++) { // i = 세로
            for(int j = 0; j < park[0].length(); j++) { // j = 가로
                parkArr[i][j] = String.valueOf(park[i].charAt(j));
                if(parkArr[i][j].equals("S")) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        
        for(int i = 0; i < routes.length; i++) {
            String[] route = routes[i].split(" ");
            String direction = route[0];
            int count = Integer.parseInt(route[1]);
            
            boolean check = false;
            if(direction.equals("N")) {
                if(answer[0] - count < 0) continue;
                for(int c = 1; c <= count; c++) {
                    if(parkArr[answer[0] - c][answer[1]].equals("X")) {
                        check = true;
                        break;
                    }
                }
                
                if(!check) {
                    answer[0] -= count;
                }
            } else if(direction.equals("S")) {
                if(answer[0] + count > height) continue;
                for(int c = 1; c <= count; c++) {
                    if(parkArr[answer[0] + c][answer[1]].equals("X")) {
                        check = true;
                        break;
                    }
                }
                if(!check) {
                    answer[0] += count;
                }
            } else if(direction.equals("W")) {
                if(answer[1] - count < 0) continue;
                for(int c = 1; c <= count; c++) {
                    if(parkArr[answer[0]][answer[1] - c].equals("X")) {
                        check = true;
                        break;
                    }
                }
                
                if(!check) {
                    answer[1] -= count;
                }
            } else if(direction.equals("E")) {
                if(answer[1] + count > width) continue;
                for(int c = 1; c <= count; c++) {
                    if(parkArr[answer[0]][answer[1] + c].equals("X")) {
                        check = true;
                        break;
                    }
                }
                
                if(!check) {
                    answer[1] += count;
                }
            }
            
        }
        return answer;
    }
}