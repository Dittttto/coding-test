import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(srt.nextToken());
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(reader.readLine());
            if (num == 0) {
                if (q.isEmpty()) {
                    writer.write(0 + "\n");
                } else {
                    writer.write(q.poll() + "\n");
                }
            } else {
                q.offer(num);
            }
        }
        
        writer.flush();
        writer.close();
    }
}
