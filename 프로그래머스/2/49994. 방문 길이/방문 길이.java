import java.util.*;

class Solution {
    int[] U = new int[]{-1, 0};
    int[] D = new int[]{1, 0};
    int[] R = new int[]{0, 1};
    int[] L = new int[]{0, -1};
    
    
    
    public int solution(String dirs) {
        Map<String, int[]> moveDir = new HashMap<>();
        moveDir.put("U", U);
        moveDir.put("D", D);
        moveDir.put("R", R);
        moveDir.put("L", L);
        
        int[][] map = new int[21][21];
        int initX = 10;
        int initY = 10;
        
        map[initX][initY] = 1;
        int answer = 0;
        for(String dir: dirs.split("")){
            int[] move = moveDir.get(dir);
            int checkX = initX + move[0];
            int checkY = initY + move[1];
            int nextX = initX + move[0]*2;
            int nextY = initY + move[1]*2;
            
            if(nextX < 0 || nextX >= 21) continue;
            if(nextY < 0 || nextY >= 21) continue;
            if(map[checkX][checkY] == 0) {
                answer += 1;
            }
            
            map[checkX][checkY] = 1;
            map[nextX][nextY] = 1;
            initX = nextX;
            initY = nextY;
        }
        
        return answer;
    }
}