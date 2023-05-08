import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: numlist) {
            list.add(num);
        }
        
        list.sort((x,y) -> {
            if((Math.abs(n-x) == Math.abs(n-y))) return y - x;
            return (Math.abs(n-x) - Math.abs(n-y));
        });
        
        int[] answer = list.stream().mapToInt(x->x).toArray();
        return answer;
    }
}