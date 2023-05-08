class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int idx = 0;
        for(String row: quiz) {
            String[] str = row.split(" ");
            int tmp = 0;
            if(str[1].equals("-")) {
                tmp = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
            }else {
                tmp = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
            }
            
            if(tmp == Integer.parseInt(str[4])) answer[idx] = "O";
            else answer[idx] = "X";
            idx++;
        }
        return answer;
    }
}