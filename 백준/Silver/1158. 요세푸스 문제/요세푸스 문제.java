import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
                String[] input = reader.readLine().split(" ");
                int n = Integer.parseInt(input[0]);
                int k = Integer.parseInt(input[1]);
                Queue<Integer> q = new LinkedList<>();
                for (int i = 1; i <= n; i++) {
                        q.add(i);
                }
                writer.write("<");
                while (q.size() > 1) {
                        for (int i = 0; i < k - 1; i++) {
                                q.offer(q.poll());
                        }

                        int poll = q.poll();
                        writer.write(poll + ", ");
                }

                writer.write(q.poll() + ">");
                writer.flush();
                writer.close();
        }
}
