import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int[][] visited;
    public static int[] dx =  {-2,-1,1,2,2,1,-1,-2};
    public static int[] dy =  {1,2,2,1,-1,-2,-2,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            int width = Integer.parseInt(reader.readLine());
            visited = new int[width][width];
            StringTokenizer srt = new StringTokenizer(reader.readLine());
            int nx = Integer.parseInt(srt.nextToken());
            int ny = Integer.parseInt(srt.nextToken());
            srt = new StringTokenizer(reader.readLine());
            int tx = Integer.parseInt(srt.nextToken());
            int ty = Integer.parseInt(srt.nextToken());

            bfs(width, nx, ny, tx, ty);

            System.out.println(visited[tx][ty] - 1);
        }
        writer.flush();
        writer.close();
    }

    public static void bfs(int width, int nx, int ny, int tx, int ty) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{nx, ny});
        visited[nx][ny] = 1;

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];

            if (cx == tx && cy == ty) return;

            for (int i = 0; i < 8; i++) {
                int px = cx + dx[i];
                int py = cy + dy[i];

                if (px < 0 || px >= width) continue;
                if (py < 0 || py >= width) continue;
                if (visited[px][py] != 0) continue;
                visited[px][py] = visited[cx][cy] + 1;
                q.add(new int[]{px, py});

            }
        }
    }
}
