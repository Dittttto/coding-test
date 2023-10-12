import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        int curW = 0;
        int curL = 0;
        int time = 0;
        int[] wait = new int[truck_weights.length];
        int idx = 0;
        int outIdx = 0;
        
        while(outIdx < truck_weights.length) {
            for(int i = outIdx; i < idx; i++) {
                if(time - wait[i] >= bridge_length) {
                    wait[outIdx] = time;
                    curW -= truck_weights[outIdx];
                    curL -= 1;                    
                    outIdx += 1;
                }
            }
            
            if(idx < truck_weights.length && 
               curW + truck_weights[idx] <= weight && 
               curL + 1 <= bridge_length) {
                
                wait[idx] = time;
                curW += truck_weights[idx];
                curL += 1;
                idx += 1;
            }
            
            
            time += 1;
        }
        
        
        return time;
    }
}