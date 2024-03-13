import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        if(k >= enemy.length){
            return enemy.length;
        }
        
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        int remain = n;
        for(int i =0; i< enemy.length; i++) {
            int cur = enemy[i];
            if(remain >= cur) {
                remain -= cur;
                queue.add(cur);
            }else {
                if(k > 0) {
                    if(!queue.isEmpty()){
                        if(queue.peek() > cur) {
                            int before = queue.poll();
                            remain += (before - cur);
                            queue.add(cur);
                        }
                    }
                    
                    k-=1;
                } else {
                    return i;
                }
            }
        }
        
        return enemy.length;
    }
}