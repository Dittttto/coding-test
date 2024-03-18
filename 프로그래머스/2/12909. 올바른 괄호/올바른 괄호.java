import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        
        for(char c: s.toCharArray()) {
            if(c == '('){
                count++;
            }
            
            if(c == ')'){
                count--;
            }
            
            if(count < 0) {
                return false;
            }
        }
        
        if(count == 0) {
            return true;
        }
        return answer;
    }
}