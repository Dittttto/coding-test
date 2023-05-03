import java.util.*;
class Solution {    
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        int start = 0;
        
        while(start < elements.length) {
            int sum = 0;
            int cnt = 0;
            int end = start;
            while(cnt < elements.length) {
                sum += elements[end];
                set.add(sum);
                end = (end + 1)%elements.length;
                cnt++;
            }
            
            start++;
        }
        
        
        return set.size();
    }
}