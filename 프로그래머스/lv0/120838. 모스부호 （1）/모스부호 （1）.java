import java.util.*;
class Solution {
    HashMap<String, String> morse = new HashMap<>(){{
        put(".-", "a"); put("-...", "b"); put("-.-.", "c"); put("-..", "d"); put(".", "e"); put("..-.", "f"); 
        put("--.", "g"); put("....", "h"); put("..", "i"); put(".---", "j"); put("-.-", "k"); put(".-..", "l");
        put("--", "m"); put("-.", "n"); put("---", "o"); put(".--.", "p"); put("--.-", "q"); put(".-.", "r");
        put("...", "s"); put("-", "t"); put("..-", "u"); put("...-", "v"); put(".--", "w"); put("-..-", "x");
        put("-.--", "y"); put("--..", "z");
    }};
    public String solution(String letter) {
        String answer = "";
        for(String alpha: letter.split(" ")) {
            answer += morse.get(alpha);
        }
        return answer;
    }
}