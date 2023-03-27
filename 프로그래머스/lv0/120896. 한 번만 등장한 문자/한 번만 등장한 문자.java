import java.util.*;

class Solution {
    public String solution(String s) {
        String[] list = s.split("");
        HashMap<String, Integer> map = new HashMap<>();
        for(String ch: list) {
            if(map.containsKey(ch)){
                map.replace(ch, map.get(ch)+1);
            }else {
                map.put(ch, 1);
            }
        }

        ArrayList<String> answer = new ArrayList<>();

        for(String key: map.keySet()){
            if(map.get(key) == 1) {
                answer.add(key);
            }
        }

        answer.sort(Comparator.naturalOrder());
        
        String result = "";
        for(String ch: answer){
            result+= ch;
        }
        
        return result;
    }
}