import java.util.*;
class Solution {
    public int[] solution(String s) {
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        int[] answer = new int[arr.length];
        
        for(int i = 0; i< arr.length; i++) {
            if(hm.containsKey(arr[i])) {
                answer[i] = i - hm.get(arr[i]);
            }else {
                answer[i] = -1;
            }
            hm.put(arr[i], i);
            
        }
        return answer;
    }
}