class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int nom = n / slice;
        int dom = n % slice != 0 ? 1 : 0;
        
        answer += nom + dom;
        return answer;
    }
}