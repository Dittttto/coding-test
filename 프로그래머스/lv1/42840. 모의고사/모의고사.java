import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
    private static final int[] PATTERN_1 = {1,2,3,4,5};
    private static final int[] PATTERN_2 = {2,1,2,3,2,4,2,5};
    private static final int[] PATTERN_3 = {3,3,1,1,2,2,4,4,5,5};
    private int[] score = new int[3];;
    
    
    public int[] solution(int[] answers) {
        for (int i = 0; i < answers.length; i++) {
            int answer = answers[i];
            if(PATTERN_1[i%5] == answer) score[0] +=1;
            if(PATTERN_2[i%8] == answer) score[1] +=1;
            if(PATTERN_3[i%10] == answer) score[2] +=1;
        }

        int maxValue = Integer.MIN_VALUE;
        for (int num: score) {
            if(maxValue < num) maxValue = num;
        }

        final int max = maxValue;
        return IntStream.range(0, 3).filter(x -> score[x] == max).map(x -> x+1).toArray();

    }
}