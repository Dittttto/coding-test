import java.util.*;
class Solution {
    public long solution(int[][] triangle) {
        long answer = 0;
        int n = (triangle.length * (triangle.length + 1 )) / 2;
        long[] dp = new long[n];
        
        int idx = 0;
        int start = 0;
        dp[0] = triangle[0][0];
        while(idx < triangle.length - 1) {
            int[] row = triangle[idx];
            int[] next = triangle[idx+1];
            
            for(int i = 0 ; i< row.length; i++) {
                dp[start + i + row.length] = Math.max(dp[start + i + row.length], dp[start +i] + next[i]);
                dp[start + i + row.length+1] = Math.max(dp[start + i + row.length+1], dp[start +i] + next[i+1]);
                answer = Math.max(answer, Math.max(dp[start + i + row.length], dp[start + i + row.length+1]));
            }
            start += row.length;
            idx++;
        }
        return answer;
    }
}