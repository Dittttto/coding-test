class Solution {
    public int solution(int n) {
        int answer = n+1;
        int lenA = Integer.toBinaryString(n).length() - Integer.toBinaryString(n).replace("1", "").length();
        while(true) {
            int lenB = Integer.toBinaryString(answer).length() - Integer.toBinaryString(answer).replace("1", "").length();
            if(lenA == lenB) break;
            answer++;
        }
        return answer;
    }
}