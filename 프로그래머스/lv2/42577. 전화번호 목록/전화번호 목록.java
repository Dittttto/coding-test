import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> hm = new HashMap<>();
        Arrays.sort(phone_book, (x,y) -> x.length() - y.length());
        int maxLen = 0;
        for(String tel: phone_book) {
            maxLen = tel.length();
            String tmp  = "";
            for(int i = 0; i< maxLen; i++) {
                tmp += tel.charAt(i);
                if(hm.get(tmp) != null) {
                    return false;
                }
            }
            
            hm.put(tel, 1);
        }
        
        
        return true;
    }
}