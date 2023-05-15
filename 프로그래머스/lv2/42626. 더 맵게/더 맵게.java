import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        for(int num: scoville) list.add(num);
        
        int answer = 0;
        while(check(list, K)) {
            int a = list.poll();            
            int b = list.poll();
            list.add(a + b * 2);
            answer++;
            if(list.size()  <= 1){
                if(list.peek() >= K) break;
                else return -1;
            }
        }
        
        return answer;
    }
    
    public boolean check(PriorityQueue<Integer> list, int K) {
        for(int num: list) {
            if(num < K) return true;
        }
        
        return false;
    }
}