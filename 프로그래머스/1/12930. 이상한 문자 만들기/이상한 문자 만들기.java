class Solution {
    public String solution(String s) {
        String[] sa = s.split("");
        String answer = "";
        int cnt = 0;
        for(String c: s.split("")) {
            cnt = c.contains(" ") ? 0 : cnt + 1;
            answer += cnt % 2 != 0 ? c.toUpperCase() : c.toLowerCase();
        }
        return answer;
    }
}