class Solution {
    static boolean[] visited;
    static int answer = 0;
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length+1];
        int[] stage = new int[dungeons.length];
        go(dungeons, k, 0);
        return answer;
    }
    
    public void go(int[][] dungeons, int k, int c) {
        answer = Math.max(answer, c);
        for(int i = 0; i< dungeons.length; i++) {
            if(!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                go(dungeons, k-dungeons[i][1], c+1);
                visited[i] = false;
            }
        }
    }
}