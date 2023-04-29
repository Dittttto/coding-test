import java.util.*;
class Solution {
    public long[] solution(int n, long left, long right) {
        int len = (int)(right - left) + 1;
        long[] arr = new long[len];
        long cnt = left / n + 1;
        for(long i = left; i<= right;i++) {
            arr[(int)(i-left)] = Math.max(cnt, (i % n)+1);
            if((i+1) % n == 0)cnt++;
        }
        
        return arr;
    }
}