class Solution {
    public int solution(int n) {
        long[] dp = new long[3628801];
        dp[1] = 1;
        
        int answer = 0;
        for(int i = 2; i < 3628800; i++) {
            dp[i] = dp[i-1] * i;
            if(dp[i] > n){
                answer = i-1;
                break;
            };
        }
        
        return answer;
    }
}