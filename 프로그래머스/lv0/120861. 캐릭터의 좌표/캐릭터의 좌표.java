class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[]{0,0};
        int midW = board[0] / 2;
        int midH = board[1] / 2;
        for(String dir: keyinput) {
            move(answer, dir, midW, midH);
        }
        return answer;
    }
    
    public void move(int[] board, String dir, int midW, int midH) {
        switch(dir) {
            case "left":
                if(board[0] - 1 < (-1 * midW)) break;
                board[0] = board[0] - 1;
                break;
            case "right":
                if(board[0] + 1 > midW) break;
                board[0] = board[0] + 1;
                break;
            case "down":
                if(board[1] - 1 < (-1 * midH)) break;
                board[1] = board[1] -1;
                break;
            case "up":
                if(board[1] + 1 > midH) break;
                board[1] = board[1] + 1;
        }
        
        return;
    }
}