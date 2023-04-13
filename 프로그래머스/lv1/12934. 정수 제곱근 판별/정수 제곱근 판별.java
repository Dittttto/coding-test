class Solution {
    public long solution(long n) {
        double x = Math.pow(n, 0.5);
        double answer = 0;
        
        if(x%1 != 0) {
            answer = -1;    
        }else {
            answer = Math.pow(x+1,2);
        }
        return (long)answer;
    }
}