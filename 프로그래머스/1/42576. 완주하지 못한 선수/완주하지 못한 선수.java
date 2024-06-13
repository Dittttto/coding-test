import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> parti = new HashMap<>();
        Map<String, Integer> compl = new HashMap<>();
        
        for(String c : completion) {
            compl.put(c, compl.getOrDefault(c, 0) + 1);
        }
        
        for(String key : participant) {
            if(compl.get(key) == null || compl.get(key) == 0){
                return key;
            }
            
            compl.put(key, compl.get(key) - 1);
        }
            
        return "";
    }
}