import java.io.*;

class Solution {
    long[] memo;
    Solution(int size) {
        this.memo = new long[size + 1];
        this.memo[0] = 1;
    }

    public long calc(int n) {
        if(n < 0) {
            return 0;
        }

        if(n == 0) {
            return 1;
        }

        if(memo[n] > 0) {
            return memo[n];
        }

        memo[n] = calc(n-1) + calc(n-2) + calc(n-3);
        return memo[n];
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(reader.readLine());
            Solution solution = new Solution(n);
            System.out.println(solution.calc(n));
        }
    }
}
