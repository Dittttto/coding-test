import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            q.offer(Integer.parseInt(reader.readLine()));
        }

        int num = q.poll();

        for (int i = 1; i <= N; i++) {

            if(!stack.isEmpty() && stack.peek() > i) {
                break;
            }

            stack.push(i);
            result.add("+");

            while(!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                result.add("-");

                if(q.isEmpty()) break;
                num = q.poll();
            }
        }

        if(!stack.isEmpty()) {
            System.out.println("NO");
            return;
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() -1) System.out.println();
        }
    }
}
