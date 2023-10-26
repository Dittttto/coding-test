import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
        public static List<List<Integer>> map;
        public static boolean[] visited;
        public static int[] dist;

        public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
                StringTokenizer srt = new StringTokenizer(reader.readLine());
                int n = Integer.parseInt(srt.nextToken());
                int m = Integer.parseInt(srt.nextToken());
                int k = Integer.parseInt(srt.nextToken());
                int x = Integer.parseInt(srt.nextToken());
                map = new ArrayList<>();
                visited = new boolean[n+1];
                dist = new int[n+1];
                for (int i = 0; i <= n; i++) {
                        map.add(new ArrayList<>());
                }

                for (int i = 0; i < m; i++) {
                        srt = new StringTokenizer(reader.readLine());
                        int from = Integer.parseInt(srt.nextToken());
                        int to = Integer.parseInt(srt.nextToken());

                        map.get(from).add(to);
                }

                bfs(x);

                int cnt = 0;
                for (int i = 1; i <= n; i++) {
                        if (dist[i] == k) {
                                writer.write(i + "\n");
                                cnt += 1;
                        }
                }

                if (cnt == 0) {
                        writer.write(-1 +"");
                }

                writer.flush();
                writer.close();
        }

        public static void bfs(int v) {
                Queue<Integer> q = new LinkedList<>();
                q.offer(v);
                visited[v] = true;

                while(!q.isEmpty()) {
                        int size = q.size();

                        for (int i = 0; i < size; i++) {
                                int cur = q.poll();

                                for (Integer next : map.get(cur)) {
                                        if (!visited[next]) {
                                                visited[next] = true;
                                                dist[next] = dist[cur] + 1;
                                                q.add(next);
                                        }
                                }
                        }
                }

        }
}
