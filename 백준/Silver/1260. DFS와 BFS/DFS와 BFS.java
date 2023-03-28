import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(srt.nextToken());
        int M = Integer.parseInt(srt.nextToken());
        int V = Integer.parseInt(srt.nextToken());

        ArrayList<LinkedList<Integer>> map = new ArrayList<>();
        ArrayList<LinkedList<Integer>> map2 = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            map.add(new LinkedList<Integer>());
            map2.add(new LinkedList<Integer>());
        }

        for (int i = 0; i < M; i++) {
            srt = new StringTokenizer(reader.readLine());
            int A = Integer.parseInt(srt.nextToken());
            int B = Integer.parseInt(srt.nextToken());

            map.get(A).offerLast(B);
            map.get(B).offerLast(A);
            map2.get(A).offerLast(B);
            map2.get(B).offerLast(A);
        }

        sortMap(map);
        sortMap(map2);
        visited = new boolean[N+1];
        dfs(map, V);
        writer.write("\n");
        visited = new boolean[N+1];
        bfs(map2, V);

        writer.flush();
        writer.close();
    }

    public static void dfs(ArrayList<LinkedList<Integer>> map, int V)throws IOException {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.offerLast(V);
        visited[V] = true;

        while(!stack.isEmpty()) {
            int pop = stack.pollLast();
            writer.write(pop + " ");
            LinkedList<Integer> next = map.get(pop);
            while(!next.isEmpty()){
                int nextV = next.pollFirst();
                if(!visited[nextV]) {
                    visited[nextV] = true;
                    dfs(map, nextV);
                }
            }
        }
    }

    public static void bfs(ArrayList<LinkedList<Integer>> map, int V) throws IOException {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offerLast(V);
        visited[V] = true;
        while(!queue.isEmpty()) {
            int pop = queue.pollFirst();
            writer.write(pop + " ");
            LinkedList<Integer> next = map.get(pop);
            while(!next.isEmpty()) {
                int nextV = next.pollFirst();
                if(!visited[nextV]) {
                    visited[nextV] = true;
                    queue.offerLast(nextV);
                }
            }
        }
    }

    public static void sortMap(ArrayList<LinkedList<Integer>> map){
        for (LinkedList<Integer> row: map) {
            row.sort(Comparator.naturalOrder());
        }
    }
}
