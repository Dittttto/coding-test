class Solution {
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length+1];
        int[] out = new int[dungeons.length];
        int answer = go(dungeons, visited, out, 0, k);
        return answer;
    }
    
    public int go(int[][] dungeons, boolean[] visited, int[] out, int depth, int k) {
        if(depth == dungeons.length) {
            int tmpK = k;
            int cnt = 0;
            for(int n: out) {
                int[] row = dungeons[n];
                if(tmpK >= row[0]) {
                    tmpK -= row[1];
                    cnt++;
                }
            }
            return cnt;
        }
        
        int result = 0;
        for(int i = 0; i< dungeons.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                out[depth] = i;
                result = Math.max(result, go(dungeons, visited, out, depth+1, k));
                visited[i] = false;
            }
        }
        
        return result;
    }
}