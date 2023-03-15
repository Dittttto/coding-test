import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] S = new int[progresses.length];
        ArrayList result = new ArrayList();
        
        for (int i = 0; i < progresses.length; i++) {
            int nom = (100 - progresses[i]) / speeds[i];
            int div = (100 - progresses[i]) % speeds[i];
            if(div != 0) {
                nom +=1;
            };

            S[i] = nom;
        }
        
        int pre = S[0];
        int cnt = 1;
        for (int i = 1; i < progresses.length; i++) {
            if(S[i] <= pre){
                cnt += 1;
            }else {
                result.add(cnt);
                cnt = 1;
                pre = S[i];
            }
        }
        
        result.add(cnt);

        
        return result.stream().mapToInt(x ->(int)x).toArray();
    }
}