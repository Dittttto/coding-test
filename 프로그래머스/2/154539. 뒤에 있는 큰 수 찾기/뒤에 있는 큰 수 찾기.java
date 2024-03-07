import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Deque<Integer> set = new ArrayDeque<>();
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        for (int i = numbers.length -1 ; i > -1 ; i--) {
            while (!set.isEmpty() && numbers[i] >= set.peekLast() ){
                set.pollLast();
            }
            if (!set.isEmpty()){
                answer[i] = set.peekLast();
            }

            set.addLast(numbers[i]);
        }
        
        return answer;
    }
}