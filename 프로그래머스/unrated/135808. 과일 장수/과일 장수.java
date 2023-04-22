import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int idx = score.length - m;
        int answer = 0;
        
        while(idx >= 0){
            answer += score[idx] * m;
            idx -= m;
        }
        
        return answer;
    }
}