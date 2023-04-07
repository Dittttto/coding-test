class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        for(String ch: s.split("")) {
            String tmp = ch.toLowerCase();
            if(tmp.equals("p")) p++;
            if(tmp.equals("y")) y++;
        }

        return p == y;
    }
}