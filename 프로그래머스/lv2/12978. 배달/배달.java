import java.util.*;

class Solution {
    class Node {
        int to;
        long weight;
        
        Node(int to, long weight) {
            this.to = to;
            this.weight = weight;
        }
    }
    
    public int solution(int N, int[][] road, int K) {
        ArrayList<LinkedList<Node>> list = new ArrayList<LinkedList<Node>>();
        long[] arr = new long[N+1];
        boolean[] visited = new boolean[N+1];
        Arrays.fill(arr, 500000);
        arr[1] = 0;
        for(int i = 0; i<= N; i++) {
            list.add(new LinkedList<Node>());
        }
        
        
        for(int[] row: road) {
            int from = row[0];
            int to = row[1];
            long weight = row[2];
            
            Node node = new Node(to, weight);
            Node node2 = new Node(from, weight);
            list.get(from).offer(node);
            list.get(to).offer(node2);
        }
        
        Node node = new Node(1, 0);
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        visited[1] = true;
        
        while(!q.isEmpty()){
            Node cur = q.poll();
            
            int to = cur.to;
            long weight = cur.weight;
            visited[to] = true;
            LinkedList<Node> link = list.get(to);
            
            for(int i = 0; i < link.size(); i++) {
                Node next = link.get(i);
                int nextTo = next.to;
                long nextWeight = next.weight;
                if(weight + nextWeight < arr[nextTo] && weight + nextWeight <= K) {
                    Node possible = new Node(nextTo, weight + nextWeight);
                    arr[nextTo] = possible.weight;
                    q.add(possible);
                }
            }
        }
        
        
        int answer = 0;
        for(boolean v: visited) {
            if(v) answer++;
        }
        
        return answer;
    }
}