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
        int n = Integer.parseInt(reader.readLine());
        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> wait = new LinkedList<>();

        int idx = 0;
        int now = 1;
        while (now <= n) {
            if (idx < n && arr[idx] == now) {
                idx += 1;
                now += 1;
                continue;
            }

            while (!wait.isEmpty() && wait.peekLast() == now) {
                wait.pollLast();
                now += 1;
            }

            if (idx >= n) {
                break;
            }
            if (wait.isEmpty()) {
                wait.offerLast(arr[idx]);
                idx += 1;
            } else {
                if (wait.peekLast() < arr[idx]) {
                    break;
                }
                wait.offerLast(arr[idx]);
                idx += 1;
            }
        }
        if (wait.size() == 0) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}