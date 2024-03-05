import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> sets = new TreeSet<>();

         for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sets.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[sets.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = sets.pollFirst();
        }
        
        return answer;
    }
}