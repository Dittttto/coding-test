class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int min = 0;
        int max = 0;
        
        for(int lNum: lottos) {
            if(lNum == 0) max++;
            for(int wNum: win_nums) {
                if(lNum == wNum) {
                    min++;
                    break;
                };
            }
        }
        max = (7 - (min + max)) > 5 ? 6 : (7 - (min + max));
        min = (7 - min) > 5 ? 6 : (7 - min);
        return new int[]{max, min};
    }
}