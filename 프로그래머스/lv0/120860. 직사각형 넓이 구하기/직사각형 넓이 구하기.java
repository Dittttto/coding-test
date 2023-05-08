class Solution {
    public int solution(int[][] dots) {
        int width = dots[0][0];
        int height = dots[0][1];
        boolean checkW = false;
        boolean checkH = false;
        for(int[] dot: dots) {
            if(!checkW && width != dot[0]) {
                width = Math.abs(width - dot[0]);
                checkW = true;
            }
            
            if(!checkH && height != dot[1]) {
                height = Math.abs(height - dot[1]);
                checkH = true;
            }
        }
        return width * height;
    }
}