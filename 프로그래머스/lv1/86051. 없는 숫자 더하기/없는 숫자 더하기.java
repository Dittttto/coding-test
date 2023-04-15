import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        int answer = 0;
        for(int num : numbers) {
            set.add(num);
        }
        
        for(int i = 0; i < 10 ;i ++) {
            if(!set.contains(i)) answer += i;
        }
        return answer;
    }
}