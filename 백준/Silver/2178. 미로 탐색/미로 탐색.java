import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter writer;
    static int[][] map;
    static int[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer sb = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(sb.nextToken());
        int m = Integer.parseInt(sb.nextToken());
        map = new int[n][m];
        visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            map[i] = Arrays.stream(reader.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        }

        bfs(0, 0, n, m);
        writer.write(visited[n-1][m-1]+"");
        writer.flush();
        writer.close();
    }

    public static void bfs(int x, int y, int n, int m) {
        int[] dx = new int[]{0,1, 0,-1};
        int[] dy = new int[]{1,0,-1,0};
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        visited[x][y] = 1;

        while (!q.isEmpty()) {
            int[] next = q.poll();
            int curX = next[0];
            int curY = next[1];
            for (int i = 0; i < 4; i++) {
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];

                if (nextX < 0 || nextX >=n) continue;
                if (nextY < 0 || nextY >=m) continue;
                if (map[nextX][nextY] == 0) continue;
                if (visited[nextX][nextY] != 0) {
                    visited[nextX][nextY] = Math.min(visited[curX][curY] + 1, visited[nextX][nextY]);
                    continue;
                }

                visited[nextX][nextY] = visited[curX][curY] + 1;
                q.offer(new int[]{nextX, nextY});
            }
        }
    }

}
