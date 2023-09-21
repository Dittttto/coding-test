import java.util.*;

class Solution {
    public int[][] solution(int n) {
        int[][] map = new int[n][n];
        int[] dy = new int[]{1,0,-1,0};
        int[] dx = new int[]{0,1,0,-1};
        
        int cx = 0;
        int cy = -1;
        int cd = 0;
        int cv = 0;
        
        while(cv < n*n) {
            int nx = cx + dx[cd];
            int ny = cy + dy[cd];
            
            if(nx < 0 || nx >= n) {
                cd = (cd + 1) % 4;
                continue;
            }
            
            if(ny < 0 || ny >= n) {
                cd = (cd + 1) % 4;
                continue;
            }
            
            if(map[nx][ny] != 0) {
                cd = (cd + 1) % 4;
                continue;
            }
            
            
            cx = nx;
            cy = ny;
            map[cx][cy] = cv + 1;
            cv += 1;
        }
        return map;
    }
}