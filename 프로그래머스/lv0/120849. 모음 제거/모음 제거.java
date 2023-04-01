class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(String ch: my_string.split("")){
            if(ch.equals("a") || ch.equals("e")||ch.equals("o")||ch.equals("i")||ch.equals("u")) continue;
            answer+=ch;
        }
        return answer;
    }
}