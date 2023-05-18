import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> stack = new LinkedList<>();
        
        int n = Integer.parseInt(reader.readLine());
        
        while(n-- > 0) {
            int num = Integer.parseInt(reader.readLine());
            if(num == 0) {
                if(!stack.isEmpty()) {
                    stack.pollLast();
                }
            }else {
                stack.offerLast(num);
            }
        }
        
        long result = 0;
        for (long num : stack) {
            result += num;
        }

        System.out.println(result);
    }
}
