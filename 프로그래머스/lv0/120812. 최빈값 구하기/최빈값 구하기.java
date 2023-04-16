import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            if(map.containsKey(num)){
                int oldValue = map.get(num);
                map.replace(num, oldValue + 1);
                continue;
            }

            map.put(num, 1);
        }

        int maxValue = 0;
        int maxKey = array[0];

        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(maxValue < entry.getValue()) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(maxValue == entry.getValue() && maxKey != entry.getKey()) {
                return -1;
            }
        }

        return maxKey;
    }
}