class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(good(i)) answer++;
        }
        return answer;
    }
    
    public boolean good(int n) {
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                cnt++;
            }
            
            if(cnt >= 3) return true;
        }
        
        return false;
    }
}