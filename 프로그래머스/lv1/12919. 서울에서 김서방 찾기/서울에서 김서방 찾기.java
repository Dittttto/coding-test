class Solution {
    public String solution(String[] seoul) {
        int x;
        for(x = 0; x< seoul.length;x++){
            if(seoul[x].equals("Kim")) break;
        }
        
        String answer = "김서방은 " + x+"에 있다";
        return answer;
    }
}