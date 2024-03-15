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
        
        Set<String> sets = new HashSet<>();
        int initX = 5;
        int initY = 5;
        
        int answer = 0;
        for(String dir: dirs.split("")){
            int[] move = moveDir.get(dir);
            int checkX = initX + move[0];
            int checkY = initY + move[1];
            
            if(checkX < 0 || checkX >= 11) continue;
            if(checkY < 0 || checkY >= 11) continue;
            
            sets.add(initX+""+initY+""+checkX+""+checkY);
            sets.add(checkX+""+checkY+""+initX+""+initY);
            initX = checkX;
            initY = checkY;
        }
        
        return sets.size()/2;
    }
}