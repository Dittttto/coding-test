import java.util.*;
class Solution {
    boolean solution(String s) {
        Deque<Character> stack = new LinkedList<>();
        for(char ch: s.toCharArray()) {
            if(stack.isEmpty()) {
                if(ch == ')') return false;
                else stack.offer(ch);
            }else {
                if(stack.peek() == '(' && ch == ')') {
                    stack.pollLast();
                }else {
                    stack.offer(ch);
                }
            }
        }
        
        return stack.size() == 0 ? true : false;
    }
}