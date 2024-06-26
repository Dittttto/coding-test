import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> left = new ArrayDeque<>();
        
        for(int i: arr) {
            if(!left.isEmpty() && left.peekLast() == i) {
                continue;
            }
            
            left.offerLast(i);
        }

        return left.stream().mapToInt(i -> i).toArray();
    }
}