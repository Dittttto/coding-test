import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public ArrayList<Integer> solution(int n) {
        if(n == 1) return new ArrayList<>(Arrays.asList(1));

        int[][] map = new int[n][];
        for (int i = 0; i < n; i++) {
            map[i] = new int[i+1];
        }

        map[0][0] = 1;
        int x = 0;
        int y = 0;
        int direction = 1;
        while(true) {
            if(direction == 1) {
                if(y + 1 < map.length &&map[y+1][x] == 0 ) {
                    map[y+1][x] = map[y][x] + 1;
                    y+= 1;
                }else {
                    if( x +1 > map[y].length || map[y][x+1] != 0){
                        break;
                    }else{
                        direction = 2;
                    }
                }
            }else if(direction ==2){
                if(x+1 < map[y].length && map[y][x+1] == 0 ) {
                    map[y][x+1] = map[y][x] +1;
                    x+=1;
                }else {
                    if(map[y-1][x-1] != 0) {
                        break;
                    }else {
                        direction = 3;
                    }
                }
            }else {
                if(x -1 > 0 && y-1 > 0 && map[y-1][x-1] == 0) {
                    map[y-1][x-1] = map[y][x] + 1;
                    x -=1;
                    y -=1;
                }else {
                    if(map[y+1][x] != 0){
                        break;
                    }else {
                        direction = 1;
                    }
                }
            }
        }

        ArrayList<Integer> answer = new ArrayList<>();
        for(int[] row: map) {
            for (int col: row) {
                answer.add(col);
            }
        }
        
        return answer;
    }
}