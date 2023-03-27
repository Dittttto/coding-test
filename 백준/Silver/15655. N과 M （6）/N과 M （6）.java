import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(srt.nextToken());
        int M = Integer.parseInt(srt.nextToken());
        boolean[] visited = new boolean[N];
        int[] arr = new int[N];
        int[] out = new int[M];

        srt = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(srt.nextToken());
        }

        Arrays.sort(arr);
        permutation(arr, visited, out, 0, N, M);
        writer.flush();
        writer.close();
    }

    public static void permutation(int[] arr, boolean[] visited, int[] out, int depth, int N, int M) throws IOException {
        if (depth == M) {
            for (int a : out) {
                writer.write(a + " ");
            }
            writer.write("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                if(depth > 0 && out[depth - 1] > arr[i]) {
                    continue;
                }
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr, visited, out, depth + 1, N, M);
                visited[i] = false;
                out[depth] = 0;
            }
        }
    }
}
