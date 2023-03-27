import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(srt.nextToken());
        int M = Integer.parseInt(srt.nextToken());
        int[] arr = new int[N];
        boolean[] visited = new boolean[N];
        int[] out = new int[M];
        for (int i = 1; i <= N; i++) {
            arr[i - 1] = i;
        }

        permutation(arr, visited, out, 0, N, M);
    }

    public static void permutation(int[] arr, boolean[] visited, int[] out, int depth, int N, int M) {
        if (depth == M) {
            for (int a : out) {
                System.out.print(a + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr, visited, out, depth + 1, N, M);
                visited[i] = false;
                out[depth] = 0;
            }
        }
    }
}
