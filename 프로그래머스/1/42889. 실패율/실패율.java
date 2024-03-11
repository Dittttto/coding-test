import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] clear = new int[N+1];
        int[] pause = new int[N+1];
        
        for(int stage: stages) {
            for(int i = 1; i < stage; i++){
                clear[i] += 1;
            }
            
            if(stage <= N) {
                pause[stage] += 1;                
            }
        }
        
        double[] percentage = new double[N];
        for(int i = 1; i< clear.length;i++) {
            if(clear[i] == 0 && pause[i] == 0){
                percentage[i-1] = 0;
            } else {
                percentage[i-1] = (double)pause[i] / (clear[i] + pause[i]);
            }
        }
        
        boolean[] visited= new boolean[N+1];
        int cnt =0;
        int[] answer = new int[N];
        
        while(cnt < N) {
            double max = -1.0;
            int idx = -1;
            for(int i = 1; i< N+1;i++ ) {
                if(percentage[i-1]  > max && !visited[i]) {
                    max = percentage[i-1];
                    idx = i;
                }
            }
            
            visited[idx] = true;
            answer[cnt] = idx;
            cnt++;
        }
        return answer;
    }
}