import java.util.HashMap;
class Solution {
    public long solution(String numbers) {
        String answer ="";
        int depth = 0;
        HashMap<String, Integer> hm = new HashMap(){{
            put("zero", 0);
            put("one", 1);
            put("two", 2);
            put("three", 3);
            put("four", 4);
            put("five", 5);
            put("six", 6);
            put("seven", 7);
            put("eight", 8);
            put("nine", 9);
        }};
        String text = "";
        for(String word: numbers.split("")){
            text += word;
            
            if(hm.containsKey(text)) {
                answer += hm.get(text);
                depth += 1;
                text = "";
            }
        }
        
        return Long.parseLong(answer);
    }
}