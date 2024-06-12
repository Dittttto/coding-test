class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.replace(" ", "+");
        StringBuilder temp = new StringBuilder();
        for(char c: s.toCharArray()) {
            if(c == '+') {
                if(temp.length() != 0) {
                    String tmp = temp.toString();
                    if(Character.isDigit(tmp.charAt(0))) {
                        sb.append(tmp.charAt(0) + tmp.substring(1).toLowerCase());
                    }else {
                        sb.append(Character.toUpperCase(tmp.charAt(0)) + tmp.substring(1).toLowerCase());
                    }
                       
                    temp = new StringBuilder();
                }
                
                sb.append(" ");
            }else {
                temp.append(c);
            }
        }
        
      if(temp.length() != 0) {
                String tmp = temp.toString();
                if(Character.isDigit(tmp.charAt(0))) {
                    sb.append(tmp.charAt(0) + tmp.substring(1).toLowerCase());
                }else {
                    sb.append(Character.toUpperCase(tmp.charAt(0)) + tmp.substring(1).toLowerCase());
                }

                temp = new StringBuilder();
            }
        
        return sb.toString();
    }
}