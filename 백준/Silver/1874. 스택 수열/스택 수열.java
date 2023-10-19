import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }

        Deque<Integer> stack = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        int outIdx = 1;
        while (idx < n) {
            if (!stack.isEmpty() && stack.peekLast() == nums[idx]) {
                while(!stack.isEmpty() && stack.peekLast() == nums[idx]) {
                    sb.append("-\n");
                    stack.pollLast();
                    idx += 1;
                }

            }else if (!stack.isEmpty() && stack.peekLast() > nums[idx]) {
                System.out.println("NO");
                return;
            }

            if (outIdx <= n) {
                sb.append("+\n");
                stack.offerLast(outIdx++);
            }
        }

        System.out.print(sb.substring(0, sb.length() - 1));
    }
}
