import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter writer;
    static ArrayList<int[]>[] map;
    static boolean[] visited;
    static int[] weight;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        map = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            map[i] = new ArrayList<>();
        }

        for (int i = 1; i <= n; i++) {
            int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int s = arr[0];
            for (int j = 1; j < arr.length - 1; j += 2) {
                int e = arr[j];
                int cost = arr[j + 1];

                map[s].add(new int[]{e, cost});
            }
        }

        int maxPerimeter = 0;
        visited = new boolean[n + 1];
        weight = new int[n + 1];
        bfs(1);
        for (int i = 2; i <= n; i++) {
            if (weight[maxPerimeter] < weight[i]) {
                maxPerimeter = i;
            }
        }

        visited = new boolean[n + 1];
        weight = new int[n + 1];
        bfs(maxPerimeter);
        Arrays.sort(weight);
        writer.write(weight[n]+"");
        writer.flush();
        writer.close();
    }

    public static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;

        while (!q.isEmpty()) {
            int value = q.poll();

            for (int[] ints : map[value]) {
                int next = ints[0];
                if (!visited[next]) {
                    visited[next] = true;
                    q.offer(next);
                    weight[next] = weight[value] + ints[1];
                }
            }
        }
    }
}
