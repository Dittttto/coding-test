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
        if(n == 0) return 1;
        if(n < 0) return 0;
        if(dp[n] != 0) return dp[n];

        long a = go(n-1);
        long b = go(n-2);
        dp[n] = (a+b) % 15746;
        return dp[n];
    }
}
