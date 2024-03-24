import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int[] right = new int[10001];
        int[] left =  new int[10001];
        int kindRight = 0;
        int kindLeft = 0;
        int result = 0;
        
        for(int t: topping) {
            if(right[t] == 0) {
                kindRight += 1;
            }
            
            right[t] += 1;
        }
        
        for(int i = 0; i < topping.length; i++) {
            int t = topping[i];
            if(left[t] == 0) {
                kindLeft += 1;
            }
                
            left[t] += 1;
            right[t] -= 1;
            
            if(right[t] == 0) {
                kindRight -= 1;
            }
            
            if(kindLeft == kindRight) {
                result += 1;
            }else if(kindLeft > kindRight) {
                break;
            }
        }
        
        return result;
    }
}