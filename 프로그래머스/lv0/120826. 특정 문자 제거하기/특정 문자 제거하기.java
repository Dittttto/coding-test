class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for(String ch: my_string.split("")) {
            if(!ch.equals(letter)){
                answer += ch;
            }
        }
        return answer;
    }
}