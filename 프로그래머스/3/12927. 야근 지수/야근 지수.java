import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        Arrays.sort(works);
        int max = works.length -1;        
        while(n-- > 0) {
            if(works[max]== 0) break;
            works[max] -= 1;
            for(int i = max; i > 0; i--) {
                if(works[i-1] < works[i]) break;
                
                int tmp = works[i];
                works[i] = works[i-1];
                works[i-1] = tmp;
            }
        }
        
        long answer = 0;
        for(int work: works) {
            answer += (work * work);
        } 
        return answer;
    }
}