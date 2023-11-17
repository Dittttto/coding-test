import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
        static boolean[] visited;
        static int[] from;
        static ArrayList<Integer>[] map;
        static int count = 1;

        public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
                String[] input = reader.readLine().split(" ");
                int n = Integer.parseInt(input[0]);
                int m = Integer.parseInt(input[1]);
                int v = Integer.parseInt(input[2]);
                visited = new boolean[n + 1];
                from = new int[n + 1];
                map = new ArrayList[n + 1];
                for (int i = 0; i <= n; i++) {
                        map[i] = new ArrayList<>();
                }

                for (int i = 0; i < m; i++) {
                        String[] nums = reader.readLine().split(" ");
                        int from = Integer.parseInt(nums[0]);
                        int to = Integer.parseInt(nums[1]);

                        map[from].add(to);
                        map[to].add(from);
                }

                for (ArrayList<Integer> integers : map) {
                        integers.sort(Comparator.reverseOrder());
                }

                dfs(v);
                for (int i = 1; i <= n; i++) {
                        writer.write(from[i] + "\n");
                }
                writer.flush();
                writer.close();
        }

        public static void dfs(int v) {
                from[v] = count++;
                visited[v] = true;
                for (int i : map[v]) {
                        if (!visited[i]) {
                                dfs(i);
                        }
                }
        }
}
