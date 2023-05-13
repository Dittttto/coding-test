import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        HashMap<Long, Integer> hm = new HashMap<>();
        while(stringTokenizer.hasMoreTokens()) {
            long num = Long.parseLong(stringTokenizer.nextToken());
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        int M = Integer.parseInt(reader.readLine());
        stringTokenizer = new StringTokenizer(reader.readLine());
        while(stringTokenizer.hasMoreTokens()) {
            long num = Long.parseLong(stringTokenizer.nextToken());
            writer.write(hm.getOrDefault(num, 0) +" ");
        }

        writer.flush();
        writer.close();
    }
}
