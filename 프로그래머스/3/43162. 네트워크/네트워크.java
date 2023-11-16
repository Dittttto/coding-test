import java.util.*;

class Solution {
    ArrayList<Integer>[] map;
    boolean[] visited;
    public int solution(int n, int[][] computers) {
        map = new ArrayList[n];
        visited = new boolean[n];
        for(int i =0 ; i< n; i++) {
            map[i] = new ArrayList<>();
        }
        
        for(int i =0; i< n; i++) {
            for(int j = 0; j < n ;j++) {
                if(i == j) continue;
                int to = computers[i][j];
                if(to == 0) continue;
                map[i].add(j);
            }
        }
        int answer = 0;
        
        for(int i =0 ;i < n;i++) {
            if(!visited[i]) {
                dfs(i);
                answer += 1;
            }
        }
        return answer;
    }
    
    public void dfs(int v) {
        visited[v] = true;
        
        for(int n: map[v]) {
            if(!visited[n]) {
                dfs(n);
            }
        }
    }
}