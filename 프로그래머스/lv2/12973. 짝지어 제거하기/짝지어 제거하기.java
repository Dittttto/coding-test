import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Deque<Character> stack = new LinkedList<>();
        
        for(char c : s.toCharArray()) {
            if(stack.isEmpty() || stack.peekLast() != c){
                stack.offer(c);
            }else {
                stack.pollLast();                
            }
        }

        return stack.size() == 0 ? 1 : 0;
    }
}