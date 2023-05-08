class Solution {
    public String solution(String polynomial) {
        int n = 0;
        int m = 0;
        for(String str: polynomial.split(" ")) {
            if(str.equals("+")) continue;
            if(str.indexOf("x") != -1) {
                if(str.equals("x")) n += 1;
                else n += Integer.parseInt(str.replaceAll("x", ""));
            }else {
                m += Integer.parseInt(str);  
            }
        }
        
        if(n != 0 && m!= 0) return n == 1 ? "x + " + m : n +"x + " + m;
        else if(m ==0 ) return n== 1 ? "x" : n +"x";
        else return m+"";
    }
}