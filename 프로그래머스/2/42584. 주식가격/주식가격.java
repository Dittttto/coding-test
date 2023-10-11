import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        Deque<Integer> stack = new LinkedList<>();
        int idx = prices.length - 1;
        int minValue = prices[idx];
        int minIdx = idx;
        int[] answer = new int[idx + 1];
        List<Integer> right = new ArrayList<>();
        right.add(prices[idx]);
        
        for(int i = prices.length -2; i > -1; i--) {
            int cnt = 0;
            for(int j = right.size() - 1; j > -1;j--) {
                int tmp = right.get(j);
                cnt ++;
                
                if(prices[i] > tmp) {
                    break;
                }
            }
            
            answer[i] = cnt;
            right.add(prices[i]);
        }
        
        return answer;
    }
}