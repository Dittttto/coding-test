class Solution {
    public String solution(int n) {
        String answer = "";
        int idx = 0;
        while (idx < n) {
            answer += idx % 2 == 0 ? "수" : "박"; 
            idx++;
        }
        return answer;
    }
}