import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] pattern = new int[]{1,2,3,1};
        int pidx = 0;
        int idx = 0;
        int answer = 0;
        
        if(ingredient.length < 4) {
            return 0;
        }
        
        while(idx < ingredient.length) {
            int num = ingredient[idx++];     
            stack.offerLast(num);
            
            if(stack.size() > 3) {
                pidx = 3;
                boolean find = true;
                while(pidx >= 0) {
                    int top = stack.pollLast();
                    if(pattern[pidx--] != top) {
                        stack.offerLast(top);
                        for(int i = pidx+2; i < 4; i++) {
                            stack.offerLast(pattern[i]);
                        }
                        find = false;
                        break;
                    }
                }
                
                if(find){
                    answer++;
                }
            }
        }
        return answer;
    }
}