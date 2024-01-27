import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            List<Integer> numbers = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

            if (numbers.get(0) == 0){
                break;
            }

            numbers = numbers.subList(1, numbers.size());
            Deque<Integer> stack = new LinkedList<>();

            for (Integer number : numbers) {
                if (!stack.isEmpty() && Objects.equals(stack.peekLast(), number)) {
                    continue;
                }

                stack.offerLast(number);
            }

            for (Integer integer : stack) {
                writer.write(integer + " ");
            }

            writer.write("$\n");
        }

        writer.flush();
        writer.close();
    }
}
