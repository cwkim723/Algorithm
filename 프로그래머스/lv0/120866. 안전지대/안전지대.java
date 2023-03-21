import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        boolean[][] check = new boolean[board.length][board.length];
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 1) {
                    check[i][j] = true;
                    if(j-1 >= 0) check[i][j-1] = true;
                    if(j+1 < board.length) check[i][j+1] = true;
                    
                    if(i-1 >= 0) {
                        check[i-1][j] = true;
                        if(j-1 >= 0) check[i-1][j-1] = true;
                        if(j+1 < board.length) check[i-1][j+1] = true;
                    }
                    if (i+1 < board.length) {
                        if(j-1 >= 0) check[i+1][j-1] = true;
                        check[i+1][j] = true;
                        if(j+1 < board.length) check[i+1][j+1] = true;
                    }
                }
            }
        }
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(check[i][j] == false) answer++;
            }
        }
        
        return answer;
    }
}