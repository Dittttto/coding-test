import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int[] xLine = new int[201];
        int answer = 0;
        for(int i = 0; i< lines.length; i++) {
            for(int j = i+1; j< lines.length;j++){
                int dx = Math.max(lines[i][0], lines[j][0]);
                int dy = Math.min(lines[i][1], lines[j][1]);
                if(dx < dy){
                    for(int k = dx+100; k < dy+100; k++) {
                        xLine[k] = 1;
                    }
                }
            }
        }
        
        for(int num: xLine) {
            if(num == 1) answer++;
        }
        
        return answer;
    }
}