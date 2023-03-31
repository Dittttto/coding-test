import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int sum = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        StringTokenizer srt  = new StringTokenizer(reader.readLine());
        int[] arr = new int[N];
        int[] out = new int[N];
        boolean[] visited = new boolean[N+1];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(srt.nextToken());
            arr[i] = num;
        }

        permutation02(arr, visited, out, 0, N);
        System.out.println(sum);

    }

    public static void permutation02(int[] arr, boolean[] visited, int[] out, int depth, int N){
           if(depth == N) {
               int temp = 0;
               for (int i = 1; i < out.length; i++) {
                   temp += Math.abs(out[i-1] - out[i]);
               }

               sum = Math.max(temp, sum);
               return;
           }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                out[depth] = arr[i];
                permutation02(arr, visited, out, depth+1, N);
                visited[i] = false;

            }
        }
    }
}
