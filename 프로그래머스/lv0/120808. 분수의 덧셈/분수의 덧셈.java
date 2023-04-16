import java.util.Arrays;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        int totalDenom = findDenom(denom1, denom2);
        int totalNumer = calcNumer(numer1, denom1, totalDenom) + calcNumer(numer2, denom2, totalDenom);
        
        answer = divideCommon(totalNumer,totalDenom);
        
        return answer;
    }
    
    static int[] divideCommon(int numer, int denom) {
        
        int divider = 2;
        
        while(divider <= denom) {
          if(numer % divider == 0 && denom % divider == 0) {
              numer /= divider;
              denom /= divider;
              continue;
          }
            
            divider +=1;
        }
        
        return new int[]{numer, denom};
    }
    
    static int calcNumer(int numer, int denom, int totalDenom){
        int differ = totalDenom / denom;
        return numer * differ;
    }
    
    static int findDenom(int denom1, int denom2) {
        int maxValue;
        int minValue;
        if(denom1 == denom2){
            return denom1;
        }
        
        if(denom1 > denom2) {
            maxValue = denom1;
            minValue = denom2;
        }else {
            maxValue = denom2;
            minValue = denom1;
        }
        
        if(maxValue % minValue == 0) {
            return maxValue;
        }
        
        return maxValue * minValue;
    }
}