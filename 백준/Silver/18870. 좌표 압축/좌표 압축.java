import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> hm = new HashMap<>();
        String[] origin = reader.readLine().split(" ");
        for(String num: origin) {
            set.add(Integer.parseInt(num));
            hm.put(Integer.parseInt(num), 0);
        }

        List<Integer> arr = new ArrayList<>(set);
        arr.sort(Comparator.naturalOrder());

        for (int i = 0; i < arr.size(); i++) {
            hm.put(arr.get(i), i);
        }

        for(String num: origin) {
            writer.write(hm.get(Integer.parseInt(num)) + " ");
        }
        writer.flush();
        writer.close();
    }
}
