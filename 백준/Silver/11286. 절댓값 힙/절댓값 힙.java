import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        PriorityQueue<Integer>  queue = new PriorityQueue<>(((o1, o2) -> {
            int a = Math.abs(o1);
            int b = Math.abs(o2);

            if(a == b) {
                return o1 < o2 ? -1 : 1;
            }

            return a - b;
        }));

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(reader.readLine());
            if(num == 0) {
                if(queue.isEmpty()) {
                    System.out.println(0);
                }else {
                    System.out.println(queue.poll());
                }
            }else {
                queue.add(num);
            }

        }
    }
}
