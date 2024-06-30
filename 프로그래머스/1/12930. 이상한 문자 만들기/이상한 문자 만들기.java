import java.util.*;
class Solution {
    public String solution(String s) {
        List<String> str = new ArrayList<>();
        
        String temp = "";
        for(String c: s.split("")){
            if(c.equals(" ")){
                if(!temp.equals("")) {
                    str.add(temp);
                    temp = "";
                }
                
                str.add(c);
                continue;
            }
            
            temp += c;
        }
        
        if(!temp.equals("")){
            str.add(temp);
        }
        
        String answer = "";
        for(String c: str) {
            if(c.equals(" ")){
                answer += c;
                continue;
            }
            String t = "";
            String[] ca = c.split("");
            for(int i = 0; i<ca.length;i++) {
                if(i % 2 == 0) {
                    t += ca[i].toUpperCase();
                }else {
                    t += ca[i].toLowerCase();
                }
            }
            
            answer += t;
        }

       return answer.substring(0, answer.length());
    }
}