import java.io.*;
public class Main {
    static double[] memo = new double[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        System.out.println((long)recursion(N));
    }

    static double recursion(int n) {
        if(n < 0) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }

        if (memo[n] > 0) {
            return memo[n];
        }

        memo[n] = (recursion(n - 2) + recursion(n - 1)) % 10007;
        return memo[n];
    }
}
