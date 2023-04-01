class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] arr = my_string.toCharArray();
        
        for(char ch: arr) {
            if(ch < 'A') {
                answer += ch -'0';
            }
        }
        return answer;
    }
}