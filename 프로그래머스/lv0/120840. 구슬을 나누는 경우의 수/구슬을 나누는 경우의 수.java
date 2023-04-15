class Solution {
    public int solution(int balls, int share) {
        double numo = 1;
        if(balls == share) return 1;
        for(int i = balls; i > share ; i--) {
            numo *= i;
        }
        
        for(int j = (balls-share); j > 0; j--) {
            numo /= j;
        }
        return (int)(numo);
    }
}