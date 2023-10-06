import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] sumArr = new int[n];
        sumArr[0] = arr[0];

        for (int i = 1; i < n; i++) {
            sumArr[i] = sumArr[i-1] + arr[i];
        }

        for (int i = 0; i <m; i++) {
            String[] toFrom = reader.readLine().split(" ");
            int from = Integer.parseInt(toFrom[0]) - 2;
            int to = Integer.parseInt(toFrom[1]) - 1;

            writer.write(sumArr[to] - (from < 0 ? 0 : sumArr[from])+"\n");
        }

        writer.flush();
        writer.close();
    }
}
