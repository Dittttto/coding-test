import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String key = reader.readLine();
            map.put(key, 0);
        }

        int result = 0;
        for (int i = 0; i < m; i++) {
            String key = reader.readLine();
            if (map.get(key) != null) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}
