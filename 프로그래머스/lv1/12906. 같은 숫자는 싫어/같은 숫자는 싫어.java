import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList result = new ArrayList();

        int pre = arr[0];
        result.add(pre);

        for (int i = 1; i < arr.length; i++) {
            if(pre != arr[i]) {
                result.add(arr[i]);
                pre = arr[i];
            }
        }

        return result.stream().mapToInt(x -> (int)x).toArray();
    }
}