import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(a, hm.getOrDefault(a, 0) + 1);
        hm.put(b, hm.getOrDefault(b, 0) + 1);
        hm.put(c, hm.getOrDefault(c, 0) + 1);
        hm.put(d, hm.getOrDefault(d, 0) + 1);   
        
        int size = hm.keySet().size();
        if(size == 1) {
            return 1111 * a;
        }else if(size == 4) {
            return Math.min(a,Math.min(b,Math.min(c,d)));
        }else if(size == 3){
            int idx = -1;
            int idx2 = -1;
            for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
                if(entry.getValue() == 1) {
                    if(idx == -1) {
                        idx = entry.getKey();
                    }else {
                        idx2 = entry.getKey();
                    }
                }
            }
            
            return idx * idx2;
        }else {
            int idx = -1;
            int idx2 = -1;
            int flag = -1;
            int flagIdx = -1;
            for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
                if(flag < entry.getValue()) {
                    flag = entry.getValue();
                    flagIdx = entry.getKey();
                }
                
                if(entry.getValue() != 0) {
                    if(idx == -1) {
                        idx = entry.getKey();
                    }else {
                        idx2 = entry.getKey();
                    }
                }
            }
            
            if(flag == 3) {
                int q = flagIdx == idx ? idx2: idx;
                return (int)Math.pow((10 * flagIdx + q), 2);
            }else {
                return (idx + idx2) * Math.abs(idx - idx2);
            }
        }
    }
}