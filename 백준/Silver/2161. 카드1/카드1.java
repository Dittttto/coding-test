import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            deque.offerLast(i);
        }

        while(deque.size() > 1) {
            int num = deque.pollFirst();
            System.out.print(num +" ");
            deque.offerLast(deque.pollFirst());
        }

        System.out.print(deque.peek());
    }
}