class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++) {
            if(check(i)) answer += i;
            else answer -= i;
        }
        return answer;
    }
    
    public boolean check(int n) {
        int cnt = 1;
        for(int i = 1; i<= n/2 ;i++) {
            if(n%i == 0) cnt++;
        }
        
        return cnt%2 == 0 ? true : false;
    }
}