import java.util.*;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int answer = arr[0];
        
        for(int i = 1; i< arr.length; i++) {
            int g = gcd(arr[i], answer);
            answer = (arr[i] * answer) / g;
        }
        return answer;
    }
    
    public int gcd(int a, int b) {
        if(b == 0){
            return a;
        }
        
        return gcd(b, a%b);
    }
}