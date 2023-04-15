import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] emergency) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> tmp = Arrays.stream(emergency).boxed().sorted((pre, nex) ->nex-pre).collect(Collectors.toList());
        for(int i = 0; i< tmp.size(); i++) {
            map.put(tmp.get(i), i+1);
        }
        int[] answer = new int[emergency.length];
        int idx = 0;
        for(int num : emergency) {
            answer[idx++] =  map.get(num);
        }
        return answer;
    }
}