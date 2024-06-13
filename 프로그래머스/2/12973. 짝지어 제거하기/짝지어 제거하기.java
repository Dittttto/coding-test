import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Deque<Character> q = new ArrayDeque<>();
        for(Character c: s.toCharArray()) {
            if(!q.isEmpty() && q.peekLast() == c) {
                q.pollLast();
            }else {
                q.offerLast(c);   
            }            
        }
        
        return q.size() == 0 ? 1 : 0;
    }
}