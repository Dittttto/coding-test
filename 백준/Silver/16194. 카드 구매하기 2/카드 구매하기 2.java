import java.io.*;

public class Main {
    static long[] memo = new long[1001];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] price = new int[N+1];

        int idx = 1;
        for (String i: reader.readLine().split(" ")){
            price[idx++] = Integer.parseInt(i);
        }
        System.out.println(recursion(N, price));
    }

    static long recursion(int n, int[] arr) {
        if(n == 0) {
            return 0;
        }

        if(memo[n] > 0) {
            return memo[n];
        }

        for (int i = 1; i <= n ; i++) {
            if(memo[n] > 0) {
                memo[n] = Math.min(memo[n], recursion(n - i, arr) + arr[i]);
            }else {
                memo[n] = recursion(n - i, arr) + arr[i];
            }
        }

        return memo[n];
    }
}
