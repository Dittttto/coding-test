class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int)(right - left + 1);
        int[] answer = new int[len];
        
        long depth = left / n + 1;
        
        for(long i = left; i<= right; i++) {
            answer[(int)(i-left)] = (int)Math.max(depth, i % n + 1);
            if((i+1) % n == 0) {
                depth ++;
            }
        }
        
        return answer;
    }
}