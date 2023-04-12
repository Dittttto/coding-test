class Solution {
    public String solution(String s) {
        String answer = "";
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(String ch : s.split(" ")) {
            int num = Integer.parseInt(ch);
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        
        answer = min + " " + max;
        return answer;
    }
}