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
                Deque<String> left = new ArrayDeque<>();
                Deque<String> right = new ArrayDeque<>();

                for (String s : reader.readLine().split("")) {
                        left.offerLast(s);
                }

                long result = 0;
                while(!left.isEmpty()) {
                        String bracket = left.pollLast();
                        if (right.isEmpty() && (bracket.equals("(") || bracket.equals("["))) {
                                result = 0;
                                break;
                        }

                        if (right.isEmpty()) {
                                right.offerLast(bracket);
                                continue;
                        }

                        long temp = 1;
                        while(!right.isEmpty()) {
                                String s = right.peekLast();
                                if (!s.equals(")") && !s.equals("]") && !s.equals("(") && !s.equals("[")) {
                                        if (temp > 1) {
                                                temp += Long.parseLong(right.pollLast());
                                        }else {
                                                temp *= Long.parseLong(right.pollLast());
                                        }

                                        if (right.isEmpty()) {
                                                right.offerLast(String.valueOf(temp));
                                                right.offerLast(bracket);
                                                break;

                                        }
                                } else if (s.equals(")") && bracket.equals("(")) {
                                        temp *= 2;
                                        right.pollLast();
                                        right.offerLast(String.valueOf(temp));
                                        break;
                                }else if (s.equals("]") && bracket.equals("[")) {
                                        temp *= 3;
                                        right.pollLast();
                                        right.offerLast(String.valueOf(temp));
                                        break;
                                }else{
                                        if (temp > 1) {
                                                right.offerLast(String.valueOf(temp));
                                        }
                                        right.offerLast(bracket);
                                        break;
                                }
                        }
                }

                for (String s : right) {
                        if (!s.equals(")") && !s.equals("]") && !s.equals("(") && !s.equals("[")) {
                                result += Integer.parseInt(s);
                        }else {
                                result = 0;
                                break;
                        }
                }

                writer.write(String.valueOf(result));
                writer.flush();
                writer.close();
        }
}
