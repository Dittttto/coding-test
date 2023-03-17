import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int T = Integer.parseInt(srt.nextToken());
        Stack<Integer> stack = new Stack<>();
        int[] numbers = new int[T];
        int[] arr = new int[T];

        for (int i = 0; i < T; i++) {
            srt = new StringTokenizer(reader.readLine());
            arr[i] = Integer.parseInt(srt.nextToken());
            numbers[i] = i + 1;
        }

        int depth = 0;
        int idx = 0;
        boolean no = false;
        ArrayList<String> result = new ArrayList<>();
        while (depth < T) {
            if (stack.empty()) {
                stack.push(numbers[idx]);
                result.add("+");
                idx += 1;
            }

            if (stack.peek() == arr[depth]) {
                result.add("-");
                stack.pop();
                depth += 1;
            } else {
                if (idx >= T) {
                    no = true;
                    break;
                }

                stack.push(numbers[idx]);
                result.add("+");
                idx += 1;
            }
        }
        if (no) {
            System.out.println("NO");
            return;
        }

        for(String text: result) {
            System.out.println(text);
        }
    }
}
