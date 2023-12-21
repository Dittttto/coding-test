import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// 핵심 아이디어
// isReverse 와 인덱스를 통해 배열을 자른다

public class Main {
        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        static StringBuilder sb;
        static boolean[][] visited;
        static int[][] map;

        static int n;
        static int m;

        static int[] dx = {-1, 0, 1, 0};
        static int[] dy = {0, 1, 0, -1};

        public static void main(String[] args) throws IOException {
                String[] input = reader.readLine().split(" ");
                n = Integer.parseInt(input[0]);
                m = Integer.parseInt(input[1]);
                map = new int[n][m];

                for (int i = 0; i < n; i++) {
                        map[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                }

                int time = 1;
                while (minus()){
                        visited = new boolean[n][m];
                        int divied = 0;
                        for (int i = 0; i < n; i++) {
                                for (int j = 0; j < m; j++) {
                                        if (map[i][j] == 0 || visited[i][j]) continue;
                                        bfs(i, j);
                                        divied += 1;
                                }
                        }

                        if (divied > 1) {
                                System.out.println(time);
                                return;
                        }

                        time += 1;
                }

                System.out.println(0);
                writer.flush();
                writer.close();
        }

        private static void bfs(int x, int y){
                Queue<int[]> q = new LinkedList<>();
                q.add(new int[]{x, y});
                visited[x][y] = true;

                while(!q.isEmpty()){
                        int[] poll = q.poll();
                        int cx = poll[0];
                        int cy = poll[1];

                        for (int i = 0; i < 4; i++) {
                                int nx = cx + dx[i];
                                int ny = cy + dy[i];

                                if (nx < 0 || nx >= n) continue;
                                if (ny < 0 || ny >= m) continue;
                                if (map[nx][ny] == 0) continue;
                                if (visited[nx][ny]) continue;

                                visited[nx][ny] = true;
                                q.add(new int[]{nx, ny});
                        }

                }
        }

        private static boolean minus() {
                int[][] memo = new int[n][m];
                boolean isMinus = false;
                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                                if (map[i][j] == 0)continue;
                                int count = 0;

                                for (int k = 0; k < 4; k++) {
                                        int cx = dx[k] + i;
                                        int cy = dy[k] + j;

                                        if (cx < 0 || cx >= n) continue;
                                        if (cy < 0 || cy >= m) continue;
                                        if (map[cx][cy] == 0) count += 1;
                                }
                                isMinus = true;
                                memo[i][j] = count;
                        }
                }

                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                                map[i][j] = Math.max(0, map[i][j] - memo[i][j]);
                        }
                }

                return isMinus;
        }
}
// boxing 비용까지 아껴야 한다.
// List<Integer> 의 경우 Integer 로 박싱이 된다.
