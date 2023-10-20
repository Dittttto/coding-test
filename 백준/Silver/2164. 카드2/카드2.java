import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        Deque<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offerLast(i);
        }

        while (!queue.isEmpty() && queue.size() > 1) {
            queue.pollFirst();
            queue.offerLast(queue.pollFirst());
        }

        writer.write(queue.peekLast() + "");
        writer.flush();
        writer.close();
    }
}
