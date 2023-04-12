import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: numlist) {
            if(num % n == 0) list.add(num);
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}