class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int[][] map = new int[land.length][4];
        
        for(int i = 0; i< land.length - 1;i++) {
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 4; k++) {
                    if(j == k) continue;
                    map[i+1][k] = Math.max(land[i+1][k] + land[i][j], map[i+1][k]);
                }
            }
            
            land[i+1] = map[i+1];
        }
        
        int max = 0;
        for(int num: land[land.length - 1]) {
            if(max < num) max = num;
        }

        return max;
    }
}