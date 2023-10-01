import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = reader.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        Map<Integer, String> numKey = new HashMap<>();
        Map<String, Integer> nameKey = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String key = reader.readLine();
            numKey.put(i+1, key);
            nameKey.put(key, i+1);
        }

        for (int i = 0; i < m; i++) {
            String key = reader.readLine();
            if (Character.isAlphabetic(key.charAt(0))) {
                writer.write(nameKey.get(key) + "\n");
            }else {
                writer.write(numKey.get(Integer.parseInt(key)) + "\n");
            }

        }

        writer.flush();
        writer.close();
    }
}
