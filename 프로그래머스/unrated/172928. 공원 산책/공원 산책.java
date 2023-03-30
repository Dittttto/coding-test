import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int N = park.length;
        int M = park[0].length();
        String[][] map = new String[N][M];
        HashMap<String, int[]> hm = new HashMap<>(){{
            put("E", new int[]{1,0});
            put("W", new int[]{-1,0});
            put("N", new int[]{0,-1});
            put("S", new int[]{0,1});
        }};

        int x = 0;
        int y = 0;
        for (int i = 0; i < N; i++) {
            map[i] = park[i].split("");
            int temp = park[i].indexOf("S");
            if(temp != -1) {
                x = temp;
                y = i;
            }
        }

        for (String s : routes) {
            String[] route = s.split(" ");
            String dir = route[0];
            int amount = Integer.parseInt(route[1]);
            int[] move = hm.get(dir);
            int copyX = x;
            int copyY = y;
            int dx = move[0];
            int dy = move[1];
            boolean block = false;
            while (amount > 0) {
                copyX += dx;
                copyY += dy;
                amount--;

                if (copyX < 0 || copyX>= M) {
                    block = true;
                    break;
                }
                if (copyY< 0 || copyY >= N) {
                    block = true;
                    break;
                }
                if (map[copyY][copyX].equals("X")) {
                    block = true;
                    break;
                }

            }

            if (!block) {
                x = copyX;
                y = copyY;
            }
        }
        
        int[] answer = {y, x};
        return answer;
    }
}