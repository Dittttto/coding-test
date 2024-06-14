class Solution {
    boolean solution(String s) {
        int pc = 0;
        int yc = 0;
        for(String i: s.toLowerCase().split("")) {
            if(i.equals("p")) {
                pc++;
            }else if(i.equals("y")) {
                yc++;
            }
        }

        return pc == yc;
    }
}