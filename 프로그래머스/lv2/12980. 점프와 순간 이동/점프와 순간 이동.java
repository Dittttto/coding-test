import java.util.*;

public class Solution {
    public int solution(int n) {
        int cnt = 1;
        
        while(n > 1) {
            if(n%2 != 0) {
                cnt++;
                n -= 1;
            }
            
            n /= 2;
        }
        
        return cnt;
    }
}