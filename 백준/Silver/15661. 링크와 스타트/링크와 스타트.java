import java.io.*;
import java.util.Arrays;

public class Main {
    static int[][] map;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        map = new int[N][];
        for (int i = 0; i <N ; i++) {
            map[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 1; i < N ; i++) {
            int[] out = new int[N-i];
            calc(N,N-i, out, 1, 0);
        }
        System.out.println(answer);
    }

    public static void calc(int N, int M, int[] out, int idx, int selected) {
        if(selected == M) {
            answer = Math.min(answer, calcSynergy(out, N, M));
            return;
        }

        if(idx > N) return;
        out[selected] = idx;
        calc(N, M, out, idx+1, selected+1);
        calc(N, M, out, idx+1, selected);
    }

    public static int calcSynergy(int[] out, int N, int M) {
        boolean[] visited = new boolean[N+1];
        int[] opposite = new int[N - M];

        for (int num: out) {
            visited[num] = true;
        }

        for (int i = 1, j= 0; i <= N; i++) {
            if(!visited[i]){
                opposite[j++] = i;
            }
        }

        int A = sum(out);
        int B = sum(opposite);
        return Math.abs(A - B);
    }
    public static int sum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if (i == j) continue;
                result += map[arr[i]-1][arr[j]-1];
            }
        }

        return result;
    }
}
