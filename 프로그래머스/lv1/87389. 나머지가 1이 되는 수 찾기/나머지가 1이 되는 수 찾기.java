class Solution {
    public int solution(int n) {
        int tmp = n - 1;
        int answer = tmp;
        for(int i = tmp; i > 1; i--) {
            if(tmp % i == 0) answer = i;
        }
        
        return answer;
    }
}