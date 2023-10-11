import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int idx = prices.length - 1;
        List<Integer> right = new ArrayList<>();
        for(int i = prices.length -1; i > -1; i--) {
            for(int j = right.size() - 1; j > -1;j--) {
                answer[i] += 1;
                if(prices[i] > right.get(j)) {
                    break;
                }
            }
            right.add(prices[i]);
        }
        
        return answer;
    }
}