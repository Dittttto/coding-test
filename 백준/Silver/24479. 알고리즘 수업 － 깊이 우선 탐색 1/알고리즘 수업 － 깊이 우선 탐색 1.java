import java.util.*;
import java.io.*;

public class Main {
    static int[] visited;
    static int depth = 1;
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(srt.nextToken());
        int M = Integer.parseInt(srt.nextToken());
        int R = Integer.parseInt(srt.nextToken());

        visited = new int[N+1];
        ArrayList<LinkedList<Integer>> map = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            map.add(i, new LinkedList<>());
        }

        for (int i = 0; i < M; i++) {
            srt = new StringTokenizer(reader.readLine());
            int A = Integer.parseInt(srt.nextToken());
            int B = Integer.parseInt(srt.nextToken());

            map.get(A).offer(B);
            map.get(B).offer(A);
        }

        sort(map);
        dfs(map, R);
        for (int i = 1; i < visited.length ; i++) {
            writer.write(visited[i] + "\n");
        }

        writer.flush();
        writer.close();
    }

    public static void dfs(ArrayList<LinkedList<Integer>> map, int R) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.offer(R);
        visited[R] = depth;

        while(!stack.isEmpty()){
            int cur = stack.pollLast();
            LinkedList<Integer> next = map.get(cur);

            while(!next.isEmpty()) {
                int nextV = next.pollFirst();
                if(visited[nextV] == 0) {
                    depth+=1;
                    dfs(map, nextV);
                }
            }
        }
    }

    public static void sort(ArrayList<LinkedList<Integer>> map) {
        for(LinkedList<Integer> row: map) {
            row.sort(Comparator.naturalOrder());
        }
    }
}
