import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer>[] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        map = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            map[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            String[] rel = reader.readLine().split(" ");
            int start = Integer.parseInt(rel[0]);
            int end = Integer.parseInt(rel[1]);

            map[start].add(end);
            map[end].add(start);
        }

        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                cnt += 1;
                dfs(i);
            }
        }

        writer.write(cnt + "");
        writer.flush();
        writer.close();
    }

    static void dfs(int v) {
        if (visited[v]) {
            return;
        }

        visited[v] = true;
        for (int next : map[v]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
