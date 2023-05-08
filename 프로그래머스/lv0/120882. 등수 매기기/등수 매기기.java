import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        ArrayList<Double> list = new ArrayList<>();
        for(int[] row: score) {
            list.add(((double)row[0] + row[1]) / 2);
        }
        
        list.sort(Comparator.reverseOrder());
        HashMap<Double, Integer> hm = new HashMap<>();
        
        for(int i =0; i< list.size(); i++) {
            if(hm.get(list.get(i))!=null) continue;
            hm.put(list.get(i), i + 1);
        }
        
        for(int i = 0; i< score.length;i++) {
            double avg = ((double)score[i][0] + score[i][1]) / 2;
            answer[i] = hm.get(avg);
        }
        
        return answer;
    }
}