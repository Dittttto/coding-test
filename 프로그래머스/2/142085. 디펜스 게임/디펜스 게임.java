import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        if(k >= enemy.length){
            return enemy.length; // 무적권이 전체 스테이지의 수와 동일하지 않다는 것을 명심해야 한다.
        }
        
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i =0; i< enemy.length; i++) {
            int cur = enemy[i];
            
            n -= enemy[i];
            queue.offer(cur);
 
            if(n < 0) {
                if(k == 0) {
                    return i;
                }
                
                n += queue.poll();
                k -=1;
            }
        }
        
        return enemy.length;
    }
}