import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int answer = Integer.MAX_VALUE;
        boolean[][] check = new boolean[maps.length][maps[0].length];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        check[0][0] = true;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int cnt = 1;
        
        while(!q.isEmpty()) {
            int len = q.size();
            for(int j = 0; j < len; j++) {
                int[] cur = q.poll();
                if(cur[0] == maps.length - 1 && cur[1] == maps[0].length -1) {
                    answer = Math.min(cnt, answer);
                }
                
                for(int i = 0; i < 4; i++) {
                    int pox = cur[0] + dx[i];
                    int poy = cur[1] + dy[i];

                    if(pox < 0 || pox >= maps.length) continue;
                    if(poy < 0 || poy >= maps[0].length) continue;
                    if(maps[pox][poy] == 0) continue;
                    if(check[pox][poy]) continue;
                    q.offer(new int[]{pox, poy});
                    check[pox][poy] = true;
                }    
            }
            cnt += 1;
        }
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }
}