import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int result = Integer.MAX_VALUE;
    static int[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        boolean[] visited = new boolean[N+1];
        int[] out = new int[N];
        map = new int[N][];
        for (int i = 0; i < N ; i++) {
            map[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        permutation(out, visited, 0, N);
        System.out.println(result);
    }


    public static void permutation(int[] out, boolean[] visited, int depth, int N) {
        if(depth == N) {
            if(isValid(out)){
                int temp= 0;
                for (int i = 0; i < out.length-1 ; i++) {
                    temp += map[out[i]][out[i+1]];
                }
                temp+= map[out[out.length - 1]][out[0]];

                result = Math.min(result, temp);
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                out[depth] = i;
                permutation(out, visited, depth+1,N);
                visited[i] = false;
            }
        }
    }

    public static boolean isValid(int[] out) {
        boolean valid = true;

        for (int i =0; i < out.length - 1 ; i++) {
            if(map[out[i]][out[i+1]]== 0 ) {
                valid = false;
                break;
            }
        }
        if(valid) {
            if(map[out[out.length - 1]][out[0]] == 0) {
                valid = false;
            }
        }
        return valid;
    }
}
