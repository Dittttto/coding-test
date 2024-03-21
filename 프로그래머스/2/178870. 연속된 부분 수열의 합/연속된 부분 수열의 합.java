import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        
        int left = 0;
        int right = 0;
        int size = -1;
        int sum = 0;
        
        while(left < sequence.length) {
            while(right <sequence.length && sum < k) {
                sum += sequence[right];  
                right ++;
            }
            
            if(sum == k) {
                if(size == -1 || size > right - left) {
                    answer[0] = left;
                    answer[1] = right - 1;
                    size = right - left;
                }
            }
            sum -= sequence[left];
            left++;
        }
        
        return answer;
    }
}