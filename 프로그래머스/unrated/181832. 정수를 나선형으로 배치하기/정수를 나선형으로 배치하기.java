import java.util.*;

class Solution {
    public int[][] solution(int n) {
        int[][] map = new int[n][n];
        int[] dy = new int[]{1,0,-1,0};
        int[] dx = new int[]{0,1,0,-1};
        
        int curX = 0;
        int curY = -1;
        int curDirection = 0;
        int curValue = 0;
        
        while(curValue < n*n) {
            int nx = curX + dx[curDirection];
            int ny = curY + dy[curDirection];
            
            if(nx < 0 || nx >= n) {
                curDirection = (curDirection + 1) % 4;
                continue;
            }
            
            if(ny < 0 || ny >= n) {
                curDirection = (curDirection + 1) % 4;
                continue;
            }
            
            if(map[nx][ny] != 0) {
                curDirection = (curDirection + 1) % 4;
                continue;
            }
            
            
            curX = nx;
            curY = ny;
            map[curX][curY] = curValue + 1;
            curValue += 1;
        }
        return map;
    }
}