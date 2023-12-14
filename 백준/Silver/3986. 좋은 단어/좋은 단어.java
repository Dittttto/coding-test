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
                long result = 0;
                for (int i = 0; i < n; i++) {
                        Deque<Character> left = new ArrayDeque<>();
                        Deque<Character> right = new ArrayDeque<>();
                        for (char c : reader.readLine().toCharArray()) {
                             left.offerLast(c);
                        }

                        while(!left.isEmpty()) {
                                char l = left.pollLast();

                                if (right.isEmpty()) {
                                        right.offerLast(l);
                                }else {
                                        char target = right.peekLast();
                                        if (target == l) {
                                                right.pollLast();
                                        }else {
                                                right.offerLast(l);
                                        }
                                }
                        }

                        if (right.isEmpty()) {
                                result += 1;
                        }
                }
                writer.write(String.valueOf(result));
                writer.flush();
                writer.close();
        }
}

// boxing 비용까지 아껴야 한다.
// List<Integer> 의 경우 Integer 로 박싱이 된다.
