class Solution {
    public int solution(int n) {
        int maxD = 1;
        int PIECE_OF_PIZZA = 6;
        int endPoint = n > PIECE_OF_PIZZA ? n : PIECE_OF_PIZZA;
        
        if(n == PIECE_OF_PIZZA) {
            return 1;
        }
        
        for(int i = 1; i <= endPoint /2; i++){
            if(n % i == 0 && PIECE_OF_PIZZA % i == 0) {
                if(maxD < i) {
                    maxD = i;
                }
            }
        }
        
        int answer = (n * PIECE_OF_PIZZA / maxD) / PIECE_OF_PIZZA;  
        return answer;
    }
}