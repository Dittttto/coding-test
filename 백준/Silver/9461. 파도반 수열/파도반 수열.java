import java.io.*;

public class Main {
    static long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        dp = new long[101];
        go(100);
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(reader.readLine());
            writer.write(dp[k-1]+"\n");
        }

        writer.flush();
        writer.close();
    }

    public static void go(int n) {
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n ; i++) {
            dp[i] = dp[i-2] + dp[i-3];
        }
    }
}
