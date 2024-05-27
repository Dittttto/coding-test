import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<Character> left = new LinkedList<>();
        
        for(char c : s.toCharArray()) {
            if(left.isEmpty()) {
                if(c == ')'){
                    return false;
                }
                
                left.offerLast(c);
            }else {
                if(c == ')') {
                    left.pollLast();
                }else {
                    left.offerLast(c);
                }
            }
        }
        
        if(left.size() == 0){
            return true;
        }
        
        return false;
    }
}