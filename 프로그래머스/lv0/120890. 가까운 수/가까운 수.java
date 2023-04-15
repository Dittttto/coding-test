import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int idx = 0;
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(Math.abs(array[i] - n) < diff) {
                diff = Math.abs(array[i] - n);
                idx = i;
            }
        }
        return array[idx];
    }
}