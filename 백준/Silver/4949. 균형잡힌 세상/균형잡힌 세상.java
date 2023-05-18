import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String token = reader.readLine();
        while(!token.equals(".")) {
            Deque<Character> stack = new LinkedList<>();
            boolean pass = true;

            char[] arr = token.toCharArray();
            for (char c: arr) {
                if(c == '(' || c == '[') {
                    stack.offerLast(c);
                }else if( c == ')' || c == ']') {
                    if (stack.isEmpty()) {
                        pass = false;
                        break;
                    }

                    if(!check(stack.peekLast(), c)) {
                        pass = false;
                        break;
                    }else {
                        stack.pollLast();
                    }
                }
            }

            if (pass && stack.isEmpty()) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }

            token = reader.readLine();
        }
    }

    public static boolean check(char top, char target) {
        if (target == ')') {
            return top == '(';
        }

        return top == '[';
    }
}
