import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int cnt = 0;
        for(int num: d) {
            if(budget == num) {
                cnt++;
                break;
            }else if(budget < num) {
                break;
            }
            
            budget -= num;
            cnt++;
        }
        
        return cnt;
    }
}