import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(srt.nextToken());
        int M = Integer.parseInt(srt.nextToken());
        int[] arr = new int[N];
        int[] out = new int[M];
        for (int i = 1; i <= N; i++) {
            arr[i - 1] = i;
        }

        permutation(arr, out, 0, N, M);
        writer.flush();
        writer.close();
    }

    public static void permutation(int[] arr, int[] out, int depth, int N, int M) throws IOException {
        if (depth == M) {
            for (int a : out) {
                writer.write(a + " ");
            }
            writer.write("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            out[depth] = arr[i];
            permutation(arr, out, depth + 1, N, M);
            out[depth] = 0;
        }
    }
}
