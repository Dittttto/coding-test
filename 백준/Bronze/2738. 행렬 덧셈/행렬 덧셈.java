import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(srt.nextToken());
        int m = Integer.parseInt(srt.nextToken());
        int[][] arr = new int[n][];
        int[][] arr2 = new int[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                writer.write((arr[i][j] + arr2[i][j]) + " ");
            }
            writer.write("\n");
        }

        writer.flush();
        writer.close();
    }
}
