class Solution {
    public int[] solution(long n) {
        int N = (int)Math.log10(n) + 1;
        
        int[] answer = new int[N];
        int idx = 0;
        while(n > 0) {
            answer[idx++] = (int)(n % 10);
            n/=10;
        }
        return answer;
    }
}