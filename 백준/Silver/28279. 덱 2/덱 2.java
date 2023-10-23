import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(srt.nextToken());
        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            srt = new StringTokenizer(reader.readLine());

            switch (srt.nextToken()) {
                case "1":
                    q.offerFirst(Integer.parseInt(srt.nextToken()));
                    break;
                case "2":
                    q.offerLast(Integer.parseInt(srt.nextToken()));
                    break;
                case "3":
                    if (q.isEmpty()) {
                        writer.write("-1\n");
                    } else {
                        writer.write(q.pollFirst() + "\n");
                    }
                    break;
                case "4":
                    if (q.isEmpty()) {
                        writer.write("-1\n");
                    } else {
                        writer.write(q.pollLast() + "\n");
                    }
                    break;
                case "5":
                    writer.write(q.size() + "\n");
                    break;
                case "6":
                    writer.write((q.isEmpty() ? 1 : 0) + "\n");
                    break;
                case "7":
                    if (q.isEmpty()) {
                        writer.write("-1\n");
                    } else {
                        writer.write(q.peekFirst() + "\n");
                    }
                    break;
                default:
                    if (q.isEmpty()) {
                        writer.write("-1\n");
                    } else {
                        writer.write(q.peekLast() + "\n");
                    }
                    break;
            }
        }

        writer.flush();
        writer.close();
    }
}
