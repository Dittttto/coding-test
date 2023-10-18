import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] order) {
        int[] box = IntStream.range(1, order.length + 1).toArray();
        Deque<Integer> stack = new LinkedList<>();
        
        int idx = 0;
        int answer = 0;
        int stackIdx = 0;
        while(idx < order.length) {
            for(int i = stackIdx; i < order[idx]; i++) {
                stack.offerLast(box[i]);
            }
            
            if (stackIdx < order[idx]) stackIdx = order[idx];
            
            if(!stack.isEmpty() && stack.peekLast() == order[idx]) {
                stack.pollLast();
                answer += 1;
                idx += 1;
            }else if(!stack.isEmpty() && stack.peekLast() != order[idx]) {
                break;
            }
            
        }
        return answer;
    }
}