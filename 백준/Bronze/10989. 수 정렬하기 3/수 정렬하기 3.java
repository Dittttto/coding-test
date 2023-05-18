import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(reader.readLine());
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        while(t-- > 0) {
            int key = Integer.parseInt(reader.readLine());
            set.add(key);
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }

        int[] arr = set.stream().mapToInt(x->x).toArray();
        Arrays.sort(arr);

        for(int num: arr){
            int cnt = hm.get(num);
            while(cnt-- >0) {
                writer.write(num + "\n");
            }
        }

        writer.flush();
        writer.close();
    }
}
