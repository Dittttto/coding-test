import java.util.*;
class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int answerIdx = 0;
        int[][] map = new int[rows+1][columns+1];
        int num = 1;
        for(int i = 1; i <=rows;i++) {
            for(int j = 1; j<=columns;j++) {
                map[i][j] = num++;
            }
        }
        
        for(int[] row: queries) {
            int x1 = row[0];
            int y1 = row[1];
            int x2 = row[2];
            int y2 = row[3];

            int l = x1;
            int r = y1;
            int dir = 0;
            int prv = map[l][r];
            int minValue = map[l][r];
            while(true){
                if(dir == 0 && r == y2) {
                    dir += 1;
                } else if(dir == 1 && l == x2) {
                    dir += 1;
                } else if(dir == 2 && r == y1 ){
                    dir += 1;
                } else if(dir == 3 && l == x1) {
                    dir = 0;
                }


                if(dir == 3 && l == x1+1 && r == y1){
                    l--;
                    map[l][r] = prv;
                    break;
                }

                if(dir == 0) {
                    r++;
                }else if(dir == 1) {
                    l++;
                }else if(dir == 2) {
                    r--;
                }else if(dir == 3) {
                    l--;   
                }

                int tmp = map[l][r];
                map[l][r] = prv;
                prv = tmp;
                if(minValue > prv) {
                    minValue = prv;
                }
            }

            answer[answerIdx++] = minValue;
        }
            
        return answer;
    }
}