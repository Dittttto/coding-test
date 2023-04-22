import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(score[0]);
        answer[0] = score[0];
        
        int idx = 0;
        int aIdx = 1;
        for(int i = 1; i< score.length;i++) {
            int j;
            for(j = 0; j < queue.size(); j++) {
                if(queue.get(j) > score[i]) break;
            }
            queue.add(j, score[i]);
            idx = queue.size() - k <= 0 ? 0 : queue.size() - k;
            answer[aIdx++] = queue.get(idx);
        }
        
        return answer;
    }
}