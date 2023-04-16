import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] xArr = new int[10];
        int[] yArr = new int[10];
        int[] map = new int[10];
        StringBuilder answer = new StringBuilder();
        for(String x: X.split("")) xArr[Integer.parseInt(x)] += 1;
        for(String y: Y.split("")) yArr[Integer.parseInt(y)] += 1;
        for(int i = 0; i< 10; i++) {
            if(xArr[i] > 0 && yArr[i] > 0){
                map[i] = Math.min(xArr[i], yArr[i]);
            }
        }
        
        boolean onlyZero = true;
        for(int i = 9; i >= 0; i--) {
            if(map[i] != 0) {
                if(i != 0) onlyZero = false;
                while(map[i]-- >0) answer.append(i);
            }
        }
        
        if(answer.toString().equals("")) return "-1";
        if(onlyZero) return "0";
        return answer.toString();
    }
}