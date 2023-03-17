import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < T; i++) {
            String[] arr = reader.readLine().split("");
            stack.addAll(Arrays.asList(arr));
            String result = "";
            String word = "";

            while (stack.size() > 0) {
                String data = stack.pop();
                if (data.equals(" ")) {
                    result = data + word + result;
                    word = "";
                } else {
                    word += data;
                }
            }
            result = word + result;
            System.out.println(result);
        }
    }
}
