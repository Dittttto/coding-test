import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num: tangerine) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
        int[] tmp = hm.values().stream().mapToInt(x->x).toArray();
        
        Arrays.sort(tmp);
        
        int idx = tmp.length-1;
        int answer = 0;
        while(k > 0) {
            k -= tmp[idx--];
            answer++;
        }
        return answer;
    }
}