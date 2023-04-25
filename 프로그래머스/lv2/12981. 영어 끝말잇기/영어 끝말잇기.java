import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> used = new HashSet<>();
        int idx = 1;
        int stage = 1;
        used.add(words[0]);
        while(stage < words.length) {
            String cur =  words[stage];
            String prev = words[stage - 1];
            
            char lastCh = prev.charAt(prev.length() - 1);
            char startCh = cur.charAt(0);
            
            if(used.contains(cur) || lastCh != startCh) {
                return new int[]{idx+1, stage / n + 1};
            }
            
            used.add(words[stage]);
            stage++;
            idx = (idx+1) % n;
        }
        
        return new int[]{0,0};
    }
}