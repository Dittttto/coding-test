import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] answers) {
        int[][] patterns = new int[3][];
        patterns[0] = new int[]{1,2,3,4,5};
        patterns[1] = new int[]{2,1,2,3,2,4,2,5};
        patterns[2] = new int[]{3,3,1,1,2,2,4,4,5,5};
        
        int[] members = new int[3];
        int maxScore = 0;
        for(int i = 0; i  < 3; i++) {
            for(int j = 0; j < answers.length; j++) {
                int idx = (j) % patterns[i].length;
                if(answers[j] == patterns[i][idx]) {
                    members[i] += 1;
                }
            }
            
            maxScore = Math.max(maxScore, members[i]);
        }
        
        List<Integer> lank = new ArrayList();
        for(int i = 0; i< 3;i++) {
            if(members[i] == maxScore){
                lank.add(i+1);
            }
        }
        
        return lank.stream().mapToInt(Integer::intValue).toArray();
    }
}