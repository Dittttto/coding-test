import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
//        public static boolean[][] visited;
//        public static int[][] map;
//    public static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
//    public static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

        public static int[] dx = {-1, 0, 1, 0};
        public static int[] dy = {0, 1, 0, -1};
        //        public static int result = Integer.MAX_VALUE;
//        public static ArrayList<Integer>[] map;
//        public static int[] dist;
        public static int[][] map;
        public static int[] visitD;
        public static boolean[][][] visited;
        public static int[][] dist;

        public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
                StringTokenizer srt = new StringTokenizer(reader.readLine());
                int n = Integer.parseInt(srt.nextToken());
                int m = Integer.parseInt(srt.nextToken());
                map = new int[n][m];
                dist = new int[n][m];
                visited = new boolean[n][m][2];
                visitD = new int[n + 1];

                for (int i = 0; i < n; i++) {
                        map[i] = Arrays.stream(reader.readLine().split("")).mapToInt(Integer::parseInt).toArray();
                }

                bfs(n, m);

                writer.flush();
                writer.close();
        }

        public static void bfs(int n, int m) {
                Queue<int[]> q = new LinkedList<>();
                q.offer(new int[]{0, 0, 1, 0});
                visited[0][0][0] = true;
                dist[0][0] = 0;

                while (!q.isEmpty()) {
                        int[] poll = q.poll();
                        int cx = poll[0];
                        int cy = poll[1];
                        int cnt = poll[2];
                        int op = poll[3];

                        if (cx == n-1 && cy == m-1) {
                                System.out.println(cnt);
                                return;
                        }

                        for (int i = 0; i < 4; i++) {
                                int px = cx + dx[i];
                                int py = cy + dy[i];

                                if (px < 0 || px >= n) {
                                        continue;
                                }
                                if (py < 0 || py >= m) {
                                        continue;
                                }


                                if (map[px][py] == 0) {
                                        if (op == 0 && !visited[px][py][0]) {
                                                q.offer(new int[]{px, py, cnt + 1, op});
                                                visited[px][py][0] = true;
                                        }else if (op != 0 && !visited[px][py][1]) {
                                                q.offer(new int[]{px, py, cnt + 1, 1});
                                                visited[px][py][1] = true;
                                        }
                                }else if (map[px][py] == 1) {
                                        if (op == 0) {
                                                q.add(new int[]{px, py, cnt + 1, 1});
                                                visited[px][py][1] = true;
                                        }
                                }
                        }
                }

                System.out.println(-1);
        }

}
