import java.io.*;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        String exp = reader.readLine();
        HashMap<Character, Double> hm = new HashMap<>();
        Deque<Double> stack = new LinkedList<>();

        for(char c: exp.toCharArray()) hm.put(c, 0.0);
        for(int i = 0; i< n;i++) {
            double num = Double.parseDouble(reader.readLine());
            char key = (char)(i + 'A');
            hm.put(key, num);
        }

        for(char c: exp.toCharArray()) {
            if(c=='+' || c == '-' || c == '*' || c =='/') {
                calc(c, stack);
            }else {
                stack.offerLast(hm.get(c));
            }
        }

        System.out.printf("%.2f", stack.peekLast());
    }

    public static void calc(char i,Deque<Double> stack) {
        if(stack.isEmpty()) return;
        double y = stack.pollLast();

        if(stack.isEmpty()) return;
        double x = stack.pollLast();

        switch (i) {
            case '+' -> {
                stack.offerLast(x + y);
                return;
            }
            case '-' -> {
                stack.offerLast(x - y);
                return;
            }
            case '*' -> {
                stack.offerLast(x * y);
                return;
            }
            case '/' -> stack.offerLast(x / y);
        }
        return;
    }
}
