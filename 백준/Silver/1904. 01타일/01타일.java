import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        dp = new long[n+1];
        System.out.println(go(n) % 15746);
    }

    public static long go(int n) {
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n ; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 15746;
        }

        return dp[n];
    }
}
