import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        static StringBuilder sb;

        public static void main(String[] args) throws IOException {
                int n = Integer.parseInt(reader.readLine());
                Deque<Node> left = new ArrayDeque<>();
                Deque<Node> right = new ArrayDeque<>();
                int[] result = new int[n + 1];
                int idx = 1;
                for (String s : reader.readLine().split(" ")) {
                        int height = Integer.parseInt(s);
                        left.offerLast(new Node(idx++, height));
                }

                while (!left.isEmpty()) {
                        Node cur = left.pollLast();
                        while (!right.isEmpty() && right.peekLast().height <= cur.height) {
                                Node last = right.pollLast();
                                result[last.idx] = cur.idx;
                        }

                        right.offerLast(cur);
                }

                sb = new StringBuilder();
                for (int i = 1; i < n + 1; i++) {
                        sb.append(result[i]).append(" ");
                }

                writer.write(sb.toString());
                writer.flush();
                writer.close();
        }

        public static class Node {
                public int idx;
                public int height;

                public Node(int idx, int height) {
                        this.idx = idx;
                        this.height = height;
                }
        }
}
