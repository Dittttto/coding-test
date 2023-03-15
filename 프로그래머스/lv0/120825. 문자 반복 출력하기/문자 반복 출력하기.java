class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");
        
        for(String str: arr) {
            answer += str.repeat(n);
        }
        
        return answer;
    }
}