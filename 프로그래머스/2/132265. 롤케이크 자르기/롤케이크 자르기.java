import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int[] memo = new int[10001];
        int kind = 0;
        for(int top: topping) {
            if(memo[top] == 0) {
                kind += 1;
            }
            memo[top] += 1;
        }
        
        int[] left =  new int[10001];
        int kindLeft = 0;
        int result = 0;
        for(int i = 0; i < topping.length; i++) {
            int top = topping[i];
            if(left[top] == 0) {
                kindLeft += 1;
            }
                
            left[top] += 1;
            memo[top] -= 1;
            
            if(memo[top] == 0) {
                kind -= 1;
            }
            
            if(kindLeft == kind) {
                result += 1;
            }else if(kindLeft > kind) {
                break;
            }
        }
        
        return result;
    }
}