import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> sets = new HashSet<>();
        int len = nums.length / 2;
        for(int i: nums) {
            sets.add(i);
        }
        
        return sets.size() < len ? sets.size() : len;
    }
}