class Solution {
    public int[] solution(int brown, int yellow) {
        int width = brown / 2 - 1;
        int height = 1;
        
        while(width > 0) {
            if((width - 2) * height == yellow) break;
            width--;
            height++;
        }
        
        return new int[]{width, height+2};
    }
}