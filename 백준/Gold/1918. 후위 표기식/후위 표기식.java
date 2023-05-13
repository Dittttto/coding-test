import java.io.*;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String exp = reader.readLine();
        Deque<Character> stack = new LinkedList<>();
        HashMap<Character, Integer> pri = new HashMap<>(){{
            put('+', 0);
            put('-', 0);
            put('*', 1);
            put('/', 1);
        }};

        for(char c: exp.toCharArray()){
            if(c >= 'A' && c <= 'Z') {
                writer.write(c + "");
            }else if(pri.containsKey(c)) {
                while(!stack.isEmpty() && stack.peekLast() != '(' && (pri.get(stack.peekLast()) >= pri.get(c))) {
                    if(!stack.isEmpty()){
                        char i = stack.pollLast();
                        writer.write(i + "");
                    }
                }
                stack.offerLast(c);
            }else if(c == '(') {
                stack.offerLast(c);
            }else {
                while (!stack.isEmpty()) {
                    char i = stack.pollLast();
                    if(i == '(') break;

                    writer.write(i + "");
                }
            }
        }

        while(!stack.isEmpty()){
            writer.write(stack.pollLast() + "");
        }

        writer.flush();
        writer.close();
    }
}
