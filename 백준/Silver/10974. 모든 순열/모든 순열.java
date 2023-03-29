import java.io.*;

public class Main {
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] arr = new int[N];
        boolean[] visited = new boolean[N+1];
        int[] out = new int[N];
        for (int i =1; i <= N; i++) {
            arr[i-1] = i;
        }

        permutation(arr, visited, out, 0, N, N);

        writer.flush();
        writer.close();
    }

     public static void permutation(int[] arr, boolean[] visited, int[] out, int depth, int N, int M) throws IOException {
        if(depth == M) {
            for(int num: out) {
                writer.write(num + " ");
            }
            writer.write("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr, visited, out, depth +1, N, M);
                visited[i] = false;
                out[depth] = 0;
            }
        }
    }
}
