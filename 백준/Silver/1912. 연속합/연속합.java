import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long[] dp = new long[n+1];
        dp[0] = arr[0];
        long max = dp[0];
        for (int i = 1; i < n; i++) {
            long tmp = arr[i] + dp[i-1];
            if(tmp > arr[i] ){
                dp[i] = tmp;

                if(tmp > max) {
                    max = tmp;
                }
            }else {
                dp[i] = arr[i];
                 if(arr[i] > max) {
                    max = arr[i];
                }
            }
        }

        System.out.println(max);
    }
}
