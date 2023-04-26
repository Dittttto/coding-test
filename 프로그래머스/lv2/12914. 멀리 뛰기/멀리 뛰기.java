class Solution {
    static int[] dp;
    public long solution(int n) {
        dp = new int[n+2];
        return jump(n, 0);
    }
    
    public int jump(int n, int pos) {
        if(dp[pos] != 0) return dp[pos];
        if(pos == n)return 1;
        if(pos > n) return 0;
        
        
        dp[pos] = (jump(n, pos+1) + jump(n, pos+2)) % 1234567;
        return dp[pos] % 1234567;
    }
}