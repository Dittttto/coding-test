import java.util.*;
class Solution {
    static int x = 0;
    static int y = 0;
    static int[][] map;
    
    public int[] solution(int rows, int columns, int[][] queries) {
        map = new int[rows+1][columns+1];
        int[] answer = new int[queries.length];
        int answerIdx = 0;

        int num = 1;
        for(int i = 1; i <=rows;i++) {
            for(int j = 1; j<=columns;j++) {
                map[i][j] = num++;
            }
        }
        
        for(int[] row: queries) {    
            int startX = row[0];
            int startY = row[1];
            x = startX;
            y = startY;
            int direction = 0;
            int prv = map[x][y];
            int minValue = map[x][y];
            while(true){
                direction = checkDirection(direction, row);
                
                if(direction == 3 && x == startX+1 && y == startY){
                    x--;
                    map[x][y] = prv;
                    break;
                }
                
                move(direction);
                prv = swap(x, y, prv);
                
                if(minValue > prv) {
                    minValue = prv;
                }
            }

            answer[answerIdx++] = minValue;
        }
            
        return answer;
    }
    
    public int swap(int i, int j, int prv) {
        int tmp = map[i][j];
        map[i][j] = prv;
        
        return tmp;
    }
    
    public int checkDirection(int direction, int[] row) {
        int x1 = row[0];
        int y1 = row[1];
        int x2 = row[2];
        int y2 = row[3];
        
        if(direction == 0 && y == y2) {
            direction += 1;
        } else if(direction == 1 && x == x2) {
            direction += 1;
        } else if(direction == 2 && y == y1 ){
            direction += 1;
        } else if(direction == 3 && x == x1) {
            direction = 0;
        }
        
        return direction;
    }
    
    public void move(int direction) {
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        
        y += dy[direction];
        x += dx[direction];
    }
}