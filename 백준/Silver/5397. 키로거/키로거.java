import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
        static Deque<Character> left;
        static Deque<Character> right;
        public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
                int n = Integer.parseInt(reader.readLine());
                List<Character> pw;
                for (int i = 0; i < n; i++) {
                         left = new ArrayDeque<>();
                         right = new ArrayDeque<>();

                        for (Character s : reader.readLine().toCharArray()) {
                                if(s == '-'){
                                        if (left.isEmpty()) continue;
                                        left.pollLast();
                                }else if(s == '<') {
                                        if (left.isEmpty()) continue;
                                        right.offerFirst(left.pollLast());
                                }else if(s == '>') {
                                        if (right.isEmpty()) continue;
                                        left.offerLast(right.pollFirst());
                                }else {
                                        left.offerLast(s);
                                }
                        }


                        StringBuilder sb = new StringBuilder();
                        left.addAll(right);
                        for (Character s : left) {
                                sb.append(s);
                        }
                        writer.write(sb + "\n");
                }

                writer.flush();
                writer.close();
        }
}
