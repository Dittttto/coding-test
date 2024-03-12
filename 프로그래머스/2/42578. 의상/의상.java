import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> selected = new HashMap<>();
        
        for(String[] row: clothes) {
            selected.put(row[1], selected.getOrDefault(row[1], 0) + 1);
        }
        
        int sum = 1;
        for(Map.Entry<String, Integer> entry: selected.entrySet()){
            sum *= entry.getValue() + 1;
        }
        
       return sum -1;
    }
}