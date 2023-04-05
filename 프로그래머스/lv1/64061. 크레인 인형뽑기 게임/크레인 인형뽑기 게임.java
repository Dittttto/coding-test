import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Deque<Integer> stack = new ArrayDeque<>();
        int answer = 0;
        for(int pos: moves) {
            int dor = find(pos, board);
            if(dor == -1) continue;
            if(!stack.isEmpty() && stack.peekLast() == dor) {
                answer++;
                stack.pollLast();

            }else {
                stack.offerLast(dor);
            }
        }
        return answer*2;
    }
    public static int find(int pos, int[][] board) {
        int tmp =0;
        for (int i = 0; i < board.length; i++) {
            if( board[i][pos-1] != 0) {
                tmp = board[i][pos-1];
                board[i][pos-1] = 0;
                break;
            }
        }

        return  tmp == 0 ? -1 : tmp;
    }
}