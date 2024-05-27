import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<Character> left = new LinkedList<>();
        
        for(char c : s.toCharArray()) {
            if(c == ')') {
                if(left.isEmpty()) {
                    return false;
                }
                
                left.pollLast();
                continue;
            }
            
            left.offerLast(c);                
        }
        
        if(left.size() == 0){
            return true;
        }
        
        return false;
    }
}