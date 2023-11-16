import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        
        Deque<Integer> left = new LinkedList<>();
        List<Integer> right = new ArrayList<>();
        int[] answer = new int[prices.length];
        
        for(int i: prices) {
            left.offerLast(i);
        }
        
        int idx = prices.length - 1;
        while(idx >= 0) {
            int cur = left.pollLast();
            int count = 0;
            for(int i = right.size() - 1; i> -1; i--) {
                count += 1;
                if(cur > right.get(i)) {
                    break;
                }                
            }
            answer[idx] = count;
            right.add(cur);
            idx -= 1;
        }
        return answer;
    }
}