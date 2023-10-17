import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        String[] words = reader.readLine().split("");
        int length = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put(words[left], 1);

        while (right < words.length) {
            if (map.keySet().size() > n) {
                if (map.get(words[left]) == 1) {
                    map.remove(words[left]);
                } else {
                    map.put(words[left], map.get(words[left]) - 1);
                }
                length = Math.max(length, right - left);
                left += 1;

            } else {
                right += 1;
                if (right >= words.length) break;
                map.put(words[right], map.getOrDefault(words[right], 0) + 1);
            }
        }
        length = Math.max(length, right - left);


        writer.write(length + "");
        writer.flush();
        writer.close();
    }
}
