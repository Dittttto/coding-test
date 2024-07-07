import java.util.*;
import java.util.Collections;
class Solution {
    public int solution(int[] d, int budget) {
        List<Integer> arr = new ArrayList<>();
        for(int i : d){
            arr.add(i);
        }
        Collections.sort(arr);
        
        int answer = 0;
        int curr = 0;
        
        for(Integer a: arr) {
            if(curr + a <= budget) {
                curr += a;
                answer += 1;
            }
        }
        return answer;
    }
}