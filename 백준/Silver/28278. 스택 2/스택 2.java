import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (arr[0] == 1) {
                stack.offerLast(arr[1]);
            }else if (arr[0] == 2) {
                if (!stack.isEmpty()) {
                     writer.write(stack.pollLast() + "\n");
                }else {
                    writer.write(-1 + "\n");
                }
            }else if (arr[0] == 3) {
                writer.write(stack.size() + "\n");
            }else if (arr[0] == 4) {
                if (stack.isEmpty()) {
                    writer.write(1 + "\n");
                } else {
                    writer.write(0 + "\n");
                }
            }else {
                if (stack.isEmpty()) {
                    writer.write(-1 + "\n");
                } else {
                    writer.write(stack.peekLast() + "\n");
                }
            }
        }
        writer.flush();
        writer.close();
    }
}