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
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            q.offer(Integer.parseInt(reader.readLine()));
        }

        while (!q.isEmpty()) {
            Integer poll = q.poll();
            if (q.isEmpty()) {
                break;
            }
            Integer poll2 = q.poll();
            count += poll2 + poll;
            q.offer(poll2 + poll);
        }
        writer.write(count + "");
        writer.flush();
        writer.close();
    }
}
