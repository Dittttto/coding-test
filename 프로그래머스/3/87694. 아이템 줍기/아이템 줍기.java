import java.util.*;

class Solution {
    int[][] map;
    int[][] visited;
    int width = 102;
    int height = 102;
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {

        map = new int[height][width];
        visited = new int[height][width];
        for(int i =0; i< height;i++) {
            for(int j = 0; j< width; j++) {
                map[i][j] = -1;
            }
        }
        
        for(int[] pos: rectangle) {
            int y = pos[0]*2;
            int x = pos[1]*2;
            int y2 = pos[2]*2;
            int x2 = pos[3]*2;
            
            for(int i = x; i<= x2; i++){
                for(int j = y; j <= y2; j++) {
                    if( i > x && i < x2 && j > y && j< y2) {
                        map[i][j] = 0;
                    } else if(map[i][j] != 0) {
                        map[i][j] = 1;                        
                    }
                }
            }
        }

        bfs(characterY * 2,characterX*2, itemY*2, itemX*2);
 
        return visited[itemY*2][itemX*2] / 2;
    }
    
    public void bfs(int cx, int cy, int ix, int iy) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{cx, cy});
        visited[cx][cy] = 1;
        
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];
            if(curX == ix && curY == iy) {
                return;
            }

            for(int j = 0; j < 4; j++) {
                int nextX = curX + dx[j];
                int nextY = curY + dy[j];

                if(nextX < 0 || nextX > height) continue;
                if(nextY < 0 || nextY > width) continue;
                if(map[nextX][nextY] != 1) continue;
                if(visited[nextX][nextY] != 0) continue;
                visited[nextX][nextY] += visited[curX][curY] + 1;
                q.add(new int[]{nextX, nextY});
            }
        }
    }
}