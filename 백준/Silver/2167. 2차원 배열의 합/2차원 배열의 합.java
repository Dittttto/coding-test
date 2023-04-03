import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution2167 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer srt;
    static int N;
    static int M;
    static int[][] map;
    static int[][] sumMap;
    public Solution2167() {}
    public void read() throws IOException {
        srt = new StringTokenizer(reader.readLine());
        N = Integer.parseInt(srt.nextToken());
        M = Integer.parseInt(srt.nextToken());

        map = new int[N][];
        sumMap = new int[N+1][M+1];

        for (int i = 0; i < N; i++) {
            map[i] = stringToIntArray(reader.readLine());
        }

        calcMap();
    }

    public void calcMap() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                sumMap[i][j] = sumMap[i][j-1] + sumMap[i-1][j] - sumMap[i-1][j-1] + map[i-1][j-1];
            }
        }
    }

    public void run() throws IOException{
        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            int[] arr = stringToIntArray(reader.readLine());
            System.out.println(find(arr[0], arr[1], arr[2], arr[3]));
        }
    }

    public int[] stringToIntArray(String s){
        return Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
    public int find(int i, int j, int x, int y) {
        return sumMap[x][y] - sumMap[i-1][y] - sumMap[x][j-1] + sumMap[i-1][j-1];
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        Solution2167 solution2167 = new Solution2167();
        solution2167.read();
        solution2167.run();
    }
}
