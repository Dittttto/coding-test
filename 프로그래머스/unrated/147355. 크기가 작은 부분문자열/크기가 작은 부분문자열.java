class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        for(int i = 0; i<= t.length() - p.length(); i++) {
            if(Long.parseLong(t.substring(i, (i + len) > t.length() ? t.length() : i + len)) <= Long.parseLong(p)) answer++;
        }
        return answer;
    }
}