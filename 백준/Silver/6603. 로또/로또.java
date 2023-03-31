import java.io.*;

public class Main {
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        int N = -1;
        while(N != 0) {
            String[] inputs = reader.readLine().split(" ");
            N = Integer.parseInt(inputs[0]);
            int M = 6;
            int[] out = new int[M];
            boolean[] visited = new boolean[N + 1];
            int[] arr = new int[N];
            for (int i = 1; i < inputs.length ; i++) {
                arr[i-1] = Integer.parseInt(inputs[i]);
            }

            permutation(arr, out, visited, 0, N, M);
            writer.write("\n");
        }

        writer.flush();
        writer.close();
    }

    public static void permutation(int[] arr, int[] out, boolean[] visited,int depth, int N, int M) throws IOException {
        if(depth == M) {
            for (int num: out) {
                writer.write(num +" ");
            }
            writer.write("\n");

            return;
        }

        for (int i = 0; i < N; i++) {
            if(!visited[i]){
                if(depth > 0 && out[depth -1] > arr[i]) continue;
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr,out, visited, depth+1, N, M);
                visited[i] = false;
            }
        }
    }
}
