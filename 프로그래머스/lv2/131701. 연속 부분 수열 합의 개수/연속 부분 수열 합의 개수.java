import java.util.*;
class Solution {    
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i< elements.length; i++) {
            int sum = 0;
            int cnt = 0;
            int end = i;
            while(cnt < elements.length) {
                sum += elements[end];
                set.add(sum);
                end = (end + 1) % elements.length;
                cnt++;
            }
        }
        
        return set.size();
    }
}