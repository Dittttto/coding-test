import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        for (int i = 0; i < n + m; i++) {
            String str = reader.readLine();
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }

        result = result.stream().sorted().collect(Collectors.toList());

        System.out.println(result.size());
        for (String s : result) {
            System.out.println(s);
        }
    }
}
