import java.io.*;
import java.util.Arrays;

public class Main {
    static int[][] map;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = N / 2;
        map = new int[N][];
        for (int i = 0; i <N ; i++) {
            map[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int[] out = new int[M];
        calc(N,M, out, 1, 0);
        System.out.println(answer);
    }

    public static void calc(int N, int M, int[] out, int idx, int selected) {
        if(selected == M) {
            answer = Math.min(answer, calcSynergy(out));
            return;
        }

        if(idx > N) return;
        out[selected] = idx;
        if (out[0] > N/2) return;
        calc(N, M, out, idx+1, selected+1);
        calc(N, M, out, idx+1, selected);
    }

    public static int calcSynergy(int[] out) {
        boolean[] visited = new boolean[out.length*2+1];
        int[] opposite = new int[out.length];

        for (int num: out) {
            visited[num] = true;
        }

        for (int i = 1, j= 0; i <= out.length*2 ; i++) {
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
