import java.util.*;
class Solution {
    int answer = 0;
    public int solution(int[] number) {
        int[] out = new int[3];
        go(number, out, 0, 0);
        return answer;
    }
    
    public void go(int[] numbers, int[] out, int idx, int selected){
        if(selected == 3) {
            int tmp = 0;
            for(int num: out) {
                tmp += num;
            }
            
            if(tmp == 0) {
                answer++;
            }
            return;
        }
        
        if(idx >= numbers.length) return;
        out[selected] = numbers[idx];
        go(numbers, out, idx+1, selected+1);
        go(numbers, out, idx+1, selected);
    }
}