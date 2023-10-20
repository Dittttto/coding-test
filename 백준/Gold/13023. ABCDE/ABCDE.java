import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter writer;
    static ArrayList<Integer>[] map;
    static boolean[] visited;
    static boolean result;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer sb = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(sb.nextToken());
        int m = Integer.parseInt(sb.nextToken());
        map = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            map[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            sb = new StringTokenizer(reader.readLine());
            int s = Integer.parseInt(sb.nextToken());
            int e = Integer.parseInt(sb.nextToken());
            map[s].add(e);
            map[e].add(s);
        }

        for (int i = 0; i < n; i++) {
            visited = new boolean[n];
            dfs(1, i, i + "");
            if (result) break;
        }
        System.out.println(result ? 1 : 0);
        writer.flush();
        writer.close();
    }

    public static void dfs(int depth, int v, String path) {
        if (visited[v]) {
            return;
        }
        if (depth == 5) {
            result = true;
            return;
        }

        visited[v] = true;
        for (int i : map[v]) {
            if (!visited[i]) {
                dfs(depth + 1, i, path + i);
                visited[i] = false;
            }
        }
    }

}
