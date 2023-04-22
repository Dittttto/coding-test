class Solution {
    public String solution(int[] food) {
        String left = "";
        String right = "";
        
        for(int i = 1; i < food.length; i++) {
            int len = food[i];
            if(food[i] % 2 != 0 ) {
                len -=1;
            }
            
            for(int j = 0; j < len/ 2; j++) {
                left += i;
                right = i + right;
            }
        }
        
        String answer = left + "0" + right;
        return answer;
    }
}