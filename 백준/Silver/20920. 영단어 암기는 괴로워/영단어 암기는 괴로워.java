import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] nums = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = nums[0];
        int limit = nums[1];
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = reader.readLine();


            if (word.length() < limit) continue;

            map.put(word, map.getOrDefault(word, 0)+ 1);
        }

        List<String> collect = map.keySet().stream().sorted((a, b) -> {
            if (Objects.equals(map.get(b), map.get(a))) {

                if (b.length() == a.length()) {
                    return a.compareTo(b);
                }

                return b.length() - a.length();
            }

            return map.get(b) - map.get(a);
        }).collect(Collectors.toList());


        for (String s : collect) {
            writer.write(s + "\n");
        }

        writer.flush();
        writer.close();
    }
}
