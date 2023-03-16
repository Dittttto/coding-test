import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int N = nums.length / 2;
        HashSet hs = new HashSet();        
        
        for(int num: nums) {
            hs.add(num);
        }
        
        if(hs.size() >= N) {
            answer = N;
        }else {
            answer = hs.size();
        }
        
        return answer;
    }
}