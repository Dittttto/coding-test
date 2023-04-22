class Solution {
    public int solution(int a, int b, int n) {
        int sum = n;
        int answer = 0;
        
        while(sum >= a) {
            int nume = (sum / a) * b;
            int dimo = sum % a;
            
            sum = nume + dimo;
            answer += nume;
        }
        return answer;
    }
}