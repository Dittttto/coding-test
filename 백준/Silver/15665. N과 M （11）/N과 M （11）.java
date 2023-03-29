import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
    static LinkedHashSet<String> result = new LinkedHashSet<>();
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(srt.nextToken());
        int M = Integer.parseInt(srt.nextToken());

        int[] arr = new int[N];
        boolean[] visited = new boolean[N+1];
        int[] out = new int[M];

        srt = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(srt.nextToken());
        }

        Arrays.sort(arr);
        permutation(arr, visited, out, 0, N, M);

        for (String item: result) {
            writer.write(item + "\n");
        }

        writer.flush();
        writer.close();
    }

    public static void permutation(int[] arr, boolean[] visited, int[] out, int depth, int N, int M) {
        if(depth == M) {
            String temp = "";
            for(int a: out) {
                temp += a + " ";
            }
            result.add(temp);
            return;
        }

        for (int i = 0; i < N; i++) {
            visited[i] = true;
            out[depth] = arr[i];
            permutation(arr, visited, out, depth+1, N,M);
            visited[i] = false;
            out[depth] = 0;
        }
    }
}
