import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().toLowerCase();
        Map<String, Integer> map = new HashMap<>();

        int maxValue = Integer.MIN_VALUE;
        String key = "";

        for(String str: input.split("")) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String str = entry.getKey();
            int value = entry.getValue();

            if(value > maxValue) {
                maxValue = value;
                key = str;
            }
        }

        int cnt = 0;
        for (int value : map.values()) {
            if (maxValue == value) {
                cnt += 1;
            }
        }

        if (cnt > 1) {
            System.out.println("?");
        }else {
            System.out.println(key.toUpperCase());
        }
    }
}
