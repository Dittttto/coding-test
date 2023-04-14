class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int idx = (int)Math.log10(num) + 1;
        while(num > 0) {
            if(num % 10 == k) {
                answer = idx;
            }
            
            num /= 10;
            idx--;
        }
        return answer;
    }
}