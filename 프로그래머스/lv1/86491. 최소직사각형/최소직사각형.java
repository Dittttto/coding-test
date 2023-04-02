class Solution {
    public int solution(int[][] sizes) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int[] row: sizes) {
            int x = row[0];
            int y = row[1];
            if(y > x) {
                row[0] = row[1];
                row[1] = x;
            }
            
            if(row[0] > max1) {
                max1 = row[0];
            }
            
            if(row[1]  > max2) {
                max2 = row[1];
            }
        }

        return max1 * max2;
    }
}