import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<int[]> list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray());
        }

        list.sort((x, y) -> {
            if (x[1] == y[1]) return x[0] - y[0];
            return x[1] - y[1];
        });

        for (int[] row : list) {
            writer.write(row[0] + " " + row[1] + "\n");
        }

        writer.flush();
        writer.close();
    }
}
