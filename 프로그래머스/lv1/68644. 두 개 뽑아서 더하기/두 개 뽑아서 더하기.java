import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numbers) {
        Arrays.sort(numbers);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(list.indexOf(numbers[i] + numbers[j]) != -1) continue;
                list.add(numbers[i] + numbers[j]);
            }
        }
        
        list.sort(Comparator.naturalOrder());

        return list.stream().mapToInt(x->x).toArray();
    }
}