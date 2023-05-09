import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        HashMap<String, Integer> hm1 = splitString(str1);
        HashMap<String, Integer> hm2 = splitString(str2);
        
        if(hm1.size() == 0 && hm2.size() == 0) return 65536;
        
        int inter = 0;
        int union = 0;
        for(Map.Entry<String, Integer> entry: hm1.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            
            if(hm2.get(key) != null) {
                inter += Math.min(value, hm2.get(key));
                union += Math.max(value, hm2.get(key));
            }else {
                union += value;
            }
        }
        
        for(Map.Entry<String, Integer> entry: hm2.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            
            if(hm1.get(key) == null) union += value;
        }
        
        return  (int)(((double)inter / union) * 65536);
    }
    
    public HashMap<String, Integer> splitString(String str) {
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(int i = 0; i< str.length()-1 ; i++ ) {
            String token = str.substring(i, i+2).toLowerCase();
            if(token.replaceAll("[^a-z]", "").length() == 2){
                hm.put(token, hm.getOrDefault(token, 0) + 1);
            }
        }
        
        return hm;
    }
}


