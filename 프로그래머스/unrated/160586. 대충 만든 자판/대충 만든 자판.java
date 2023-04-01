import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
       HashMap<String, Integer> map = new HashMap<>();
        int[] answer = new int[targets.length];
        for(String arr: keymap) {
            String[] temp = arr.split("");
            for (int i = 0; i < temp.length; i++) {
                String key = temp[i];
                if (map.containsKey(key)) {
                    map.replace(key, Math.min(map.get(key), i+1));
                }else {
                    map.put(key, i+1);
                }
            }
        }

        int idx = 0;
        for(String target: targets) {
            String[] targetArr = target.split("");
            int temp = 0;
            for(String ch: targetArr) {
                if (!map.containsKey(ch)) {
                    temp = -1;
                    break;
                }
                temp += map.get(ch);
            }

            answer[idx++] = temp;
        }
        return answer;
    }
}