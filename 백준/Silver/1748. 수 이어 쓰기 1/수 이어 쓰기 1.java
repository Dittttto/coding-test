import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int depth = 1;
        long result = 0L;

        while(true) {
            long lasNumOfDepth = (long) Math.pow(10, depth) - 1;
            if (lasNumOfDepth <= n) {
                result += 9 * (long)Math.pow(10, depth - 1) * depth;
            }else {
                result += (n - (long)(Math.pow(10, depth - 1) - 1)) * depth;
                break;
            }

            depth += 1;
        }

        System.out.println(result);
    }
}
