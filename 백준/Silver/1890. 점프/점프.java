import java.util.*;
import java.io.*;
class Solution1890 {
    int N;
    int[][] map;
    public Solution1890() {}
    public void read() throws IOException {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(reader.readLine());
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            map[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
    }

 public long calc2() {
        long[][] dp = new long[N][N];
        dp[0][0] = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int cur = map[i][j];
                if(cur == 0) {
                    break;
                }

                if(j + cur < N) {
                    dp[i][j+cur] += dp[i][j];
                }

                if(i + cur < N) {
                    dp[i+cur][j] += dp[i][j];
                }
            }

        }
        return dp[N-1][N-1];
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Solution1890 solution1890 = new Solution1890();
        solution1890.read();
        System.out.println(solution1890.calc2());
    }
}
