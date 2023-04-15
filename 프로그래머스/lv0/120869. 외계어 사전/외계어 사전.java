import java.util.regex.Pattern;
class Solution {
    public int solution(String[] spell, String[] dic) {
        for(String d : dic) {
            int tmp = 0;
            String dCopy = d;
            for(String s: spell) {
                if(dCopy.length() - dCopy.replace(s, "").length() == 1) {
                    dCopy = dCopy.replace(s, "");
                    tmp++;
                }
                else {
                    break;
                }
            }
            
            if(tmp == spell.length && dCopy.length() == 0) return 1;
        }
        return 2;
    }
}