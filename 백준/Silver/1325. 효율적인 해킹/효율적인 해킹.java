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
        public static ArrayList<Integer>[] map;
        public static int[] dist;
        public static int[] visitD;

        public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
                StringTokenizer srt = new StringTokenizer(reader.readLine());
                int n = Integer.parseInt(srt.nextToken());
                int m = Integer.parseInt(srt.nextToken());
                map = new ArrayList[n+1];
                visitD = new int[n+1];
                for (int i = 0; i <= n; i++) {
                        map[i] = new ArrayList<>();
                }

                for (int i = 0; i < m; i++) {
                        srt = new StringTokenizer(reader.readLine());
                        int from = Integer.parseInt(srt.nextToken());
                        int to = Integer.parseInt(srt.nextToken());

                        map[from].add(to);
                }

                for (int i = 1; i <= n; i++) {
                        dist = new int[n+1];
                        bfs(i);
                }

                int resultDist = 0;
                for (int i : visitD) {
                        if (i > resultDist) resultDist = i;
                }

                for (int i = 1; i <= n; i++) {
                        if (visitD[i] == resultDist) {
                                writer.write(i + " ");
                        }
                }


                writer.flush();
                writer.close();
        }

        public static void bfs(int v) {
                Queue<Integer> q = new LinkedList<>();
                q.offer(v);
                dist[v] = 1;

                while(!q.isEmpty()) {

                        int cur = q.poll();
                        for (Integer next : map[cur]) {
                                if (dist[next] == 0) {
                                        dist[next] = 1;
                                        visitD[next] += 1;
                                        q.add(next);
                                }
                        }
                }
        }
}
