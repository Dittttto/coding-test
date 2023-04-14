import java.util.*;
class Solution {
    public int solution(String before, String after) {
        String[] bArr = before.split("");
        String[] aArr = after.split("");
        HashMap<String, Integer> beforeMap = new HashMap<>();
        HashMap<String, Integer> afterMap = new HashMap<>();
        for(int i = 0; i< bArr.length; i++) {
            beforeMap.put(bArr[i], beforeMap.getOrDefault(bArr[i], 0) + 1);
            afterMap.put(aArr[i], afterMap.getOrDefault(aArr[i], 0) + 1);
        }
        
        for(Map.Entry<String, Integer> entry: beforeMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if(!afterMap.containsKey(key)) return 0;
            if(afterMap.get(key) != value) return 0;
        }
        
        return 1;
    }
}
