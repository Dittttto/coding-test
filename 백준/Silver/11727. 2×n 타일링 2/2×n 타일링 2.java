import java.io.*;
public class Main {
    static double[] memo = new double[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        System.out.println((long)recursion02(N));
    }
    static double recursion02(int n) {
        memo[0] = 1;
        memo[1] = 1;

        for (int i = 2; i <= n; i++) {
            memo[i] = (memo[i-1] + 2 * memo[i-2]) % 10007;
        }

        return memo[n];
    }
}
