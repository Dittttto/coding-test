import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] challenger = new int[N+2];
        for(int i = 0 ;i < stages.length; i++) {
            challenger[stages[i]] += 1;
        }
        
        double total = stages.length;
        Map<Integer, Double> failure = new HashMap<>();
        for (int i = 1; i<= N; i++){
            if(challenger[i] == 0){
                failure.put(i, 0.0);                
            }else {
                failure.put(i, challenger[i] / total);
                total -= challenger[i];
            }
        }
        
        failure.remove(N+1);
        List<Integer> keys = new ArrayList<>(failure.keySet());
        keys.sort((o1, o2) ->{
            return  failure.get(o2).compareTo(failure.get(o1));
        });
        return keys.stream().mapToInt(Integer::intValue).toArray();
    }
}