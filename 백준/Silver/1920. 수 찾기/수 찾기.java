import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = Integer.parseInt(reader.readLine());
        for (String num: reader.readLine().split(" ")) {
            int idx = Integer.parseInt(num);
            hm.put(idx, 1);
        }

        int m = Integer.parseInt(reader.readLine());
        for (String num: reader.readLine().split(" ")) {
            int idx = Integer.parseInt(num);
            int value = hm.get(idx) == null ? 0 : 1;
            writer.write(value + "\n");
        }

        writer.flush();
        writer.close();
    }
}
