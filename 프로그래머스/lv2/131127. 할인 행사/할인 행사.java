import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> need = new HashMap<>();
        for(int i =0; i < want.length; i++) {
            need.put(want[i], number[i]);
        }
        
        int left = 0;
        int answer = 0;
        
        while(left < discount.length) {
            HashMap<String, Integer> day = new HashMap<>();
            for(int i =0; i < want.length; i++) {
                day.put(want[i], 0);
            }
            int essential = 0;
            for(int i = left; i < left+10; i++) {
                if(i < discount.length && need.get(discount[i]) != null) {
                    day.replace(discount[i], day.get(discount[i])+1);
                    
                    if(day.get(discount[i]) == need.get(discount[i])) {
                        essential++;
                    }
                }
            }
            
            if(essential >= want.length) {
                answer++;
            }
            
            left++;
        }
        
        return answer;
    }
}