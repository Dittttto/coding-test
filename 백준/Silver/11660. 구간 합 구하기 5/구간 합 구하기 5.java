import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] nums = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = nums[0];
        int m = nums[1];
        int[][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            int[] row = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            map[i] = row;
        }

        long[][] s = new long[n][n];
        s[0][0] = map[0][0];

        for (int i = 1; i < n; i++) {
            s[0][i] = map[0][i] + s[0][i - 1];
        }

        for (int i = 1; i < n; i++) {
            s[i][0] = map[i][0] + s[i - 1][0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                s[i][j] = map[i][j] + s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1];
            }
        }

        for (int i = 0; i < m; i++) {
            int[] pos = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x1 = pos[0] - 1;
            int y1 = pos[1] - 1;
            int x2 = pos[2] - 1;
            int y2 = pos[3] - 1;

            long result = s[x2][y2];
            if (x1 - 1 >= 0) result -= s[x1 - 1][y2];
            if (y1 - 1 >= 0) result -= s[x2][y1 - 1];
            if (x1 - 1 >= 0 && y1 - 1 >= 0) result += s[x1 - 1][y1 - 1];
            writer.write(result + "\n");
        }

        writer.flush();
        writer.close();
    }
}
