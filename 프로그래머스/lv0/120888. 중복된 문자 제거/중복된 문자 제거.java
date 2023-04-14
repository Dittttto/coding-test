import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        HashSet<Character> set = new HashSet<>();
        for(char ch: my_string.toCharArray()) {
            if(set.contains(ch)) continue;
            set.add(ch);
            answer += String.valueOf(ch);
        }
        return answer;
    }
}