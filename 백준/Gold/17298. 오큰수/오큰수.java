import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        int T = Integer.parseInt(reader.readLine());
        Stack<Node> stack = new Stack<>();
        int[] numbers = new int[T];
        int[] answer = new int[T];

        stringTokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < T; i++) {
            numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i < T; i++) {
            int num = numbers[i];

            while(!stack.isEmpty() && stack.peek().val < num) {
                answer[stack.peek().idx] = num;
                stack.pop();
            }

            stack.push(new Node(i, num));
        }

        while(!stack.isEmpty()){
            Node pop = stack.pop();
            answer[pop.idx] = -1;
        }

        for (int i : answer) {
            writer.write(i + " ");
        }
        writer.flush();
        writer.close();
    }

    static class Node{
        int idx = 0;
        int val = 0;

        public Node(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }
    }
}
