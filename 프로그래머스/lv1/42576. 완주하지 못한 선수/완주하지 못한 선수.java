import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int idx = 0;
        String answer = "";
        while(idx < completion.length) {
            if(!participant[idx].equals(completion[idx])){
                answer = participant[idx];
                break;
            }
            
            idx++;
        }
        
        if(answer.equals("")) {
            answer = participant[idx];
        }
        
        return answer;
    }
}