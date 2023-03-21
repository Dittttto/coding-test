import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = reader.readLine().split("");
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (int i = 1; i <= strings.length; i++) {
            String bk = strings[i - 1];

            if(bk.equals("(")) {
                stack.push(i);
            }else if(!stack.isEmpty() && stack.peek()+1 == i) {
                stack.pop();
                result += stack.size();
            }else {
                stack.pop();
                result += 1;
            }
        }

        System.out.println(result);
    }
}