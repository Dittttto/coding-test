import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer srt;
        int T = Integer.parseInt(reader.readLine());
        ArrayList<LinkedList<Integer>> map = new ArrayList<>();
        for (int i = 0; i <= T; i++) {
            map.add(i, new LinkedList<>());
        }

        boolean[] visited = new boolean[T+1];
        int[] parent = new int[T+1];
        for (int i = 0; i < T - 1; i++) {
            srt = new StringTokenizer(reader.readLine());
            int A = Integer.parseInt(srt.nextToken());
            int B = Integer.parseInt(srt.nextToken());
            map.get(A).offerLast(B);
            map.get(B).offerLast(A);
        }

        bfs(map, visited, parent);
        for (int i = 2; i < parent.length; i++) {
            writer.write(parent[i] + "\n");
        }

        writer.flush();
        writer.close();
    }
    
    public static void bfs(ArrayList<LinkedList<Integer>> map, boolean[] visited, int[] parent){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);

       while(!queue.isEmpty()) {
            int cur = queue.poll();
            LinkedList<Integer> curArr = map.get(cur);
            while(curArr.size() > 0) {
                int num = curArr.pollFirst();
                if(!visited[num]) {
                    queue.offer(num);
                    visited[num] = true;
                    parent[num] = cur;
                }
            }
        }
    }
}
