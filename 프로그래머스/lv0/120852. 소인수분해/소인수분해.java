import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        boolean[] checked = new boolean[10001];
        
        for(int i = 2; i < 10001; i++) {
            if(checked[i]) continue;
            for(int j = i +1 ; j < 10001; j++) {
                if(j % i == 0) checked[j] = true;
            }
        }
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 2; i <= n; i++) {
            if(!checked[i] && n%i == 0) set.add(i);
        }
        return set.stream().mapToInt(x -> x).sorted().toArray();
    }
}