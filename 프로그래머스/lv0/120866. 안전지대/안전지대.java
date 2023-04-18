import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        boolean[][] check = new boolean[n][n];
        
        for(int i = 0; i<n;i++) {
            for(int j = 0; j < n;j++) {
                if(board[i][j] == 1) {
                    check[i][j] = true;
                    mark(check, i, j);
                }
            }
        }
        
        int answer = 0;
        
        for(boolean[] row: check) {
            for(boolean status: row) {
                if(!status) answer++;
            }
        }
        return answer;
    }
    
    public void mark(boolean[][] check, int x, int y) {
        int[] pox = new int[]{0,0,1,-1,-1,1,-1,1};
        int[] poy = new int[]{1,-1,0,0,-1,-1,1,1};
        
        for(int i = 0; i< pox.length;i++) {
            int dx = x + pox[i];
            int dy = y + poy[i];
            if(dx < 0 || dx >= check.length) continue;
            if(dy < 0 || dy >= check.length) continue;
            if(check[dx][dy]) continue;
            check[dx][dy] = true;
        }
    }
}