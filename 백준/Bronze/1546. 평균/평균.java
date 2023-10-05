import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] scores = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxValue = Arrays.stream(scores).max().orElse(0);
        double average = Arrays.stream(scores).mapToDouble(score -> ((double) score / maxValue) * 100).average().orElse(0.0);
        System.out.println(average);
    }
}
