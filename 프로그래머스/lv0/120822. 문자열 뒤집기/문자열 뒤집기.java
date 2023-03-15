class Solution {
    public String solution(String my_string) {
        String[] strings =  my_string.split("");
        String answer = "";
        for(int i = strings.length - 1; i >= 0; i--) {
            answer += strings[i];
        }
        
        return answer;
    }
}