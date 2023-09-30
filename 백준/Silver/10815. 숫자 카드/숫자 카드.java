import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int[] card = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> set = new HashSet<>();

        for (int i : card) {
            set.add(i);
        }

        int m = Integer.parseInt(reader.readLine());
        int[] checkList = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i : checkList) {
            if (set.contains(i)) {
                writer.write(1 + " ");
            } else {
                writer.write(0 + " ");
            }
        }

        writer.flush();
        writer.close();
    }
}
