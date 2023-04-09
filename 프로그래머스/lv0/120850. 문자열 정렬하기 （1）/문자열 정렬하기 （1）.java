import java.util.*;
import java.lang.Character;
class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        for(char ch: my_string.toCharArray()) {
            if(!Character.isAlphabetic(ch)) {
                list.add(ch-'0');
            }
        }
        
        list.sort(Comparator.naturalOrder());
        return list.stream().mapToInt(x -> x).toArray();
    }
}