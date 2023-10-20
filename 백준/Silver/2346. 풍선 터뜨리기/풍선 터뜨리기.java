import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] arr = reader.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        Deque<int[]> wait = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            wait.offerLast(new int[]{i + 1, Integer.parseInt(arr[i])});
        }

        while (!wait.isEmpty()) {
            int[] balloon = wait.pollFirst();
            int value = balloon[1];
            sb.append(balloon[0]);
            sb.append(" ");
            if (wait.isEmpty()) {
                break;
            }
            if (value > 0) {
                while (--value > 0) {
                    wait.offerLast(wait.pollFirst());
                }
            } else {
                while (value++ < 0) {
                    wait.offerFirst(wait.pollLast());
                }
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
