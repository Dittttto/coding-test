import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(srt.nextToken());
        int l = Integer.parseInt(srt.nextToken());
        Deque<Node> q = new LinkedList<>();

        srt = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            int cur = Integer.parseInt(srt.nextToken());

            while (!q.isEmpty() && q.peekLast().val > cur) {
                q.pollLast();
            }

            q.offerLast(new Node(i, cur));

            if (q.peekFirst().index < i - l + 1) {
                q.pollFirst();
            }

            writer.write(q.peekFirst().val + " ");
        }

        writer.flush();
        writer.close();
    }


    static class Node {
        int index = 0;
        int val = 0;

        public Node(int index, int val) {
            this.index = index;
            this.val = val;
        }
    }
}
