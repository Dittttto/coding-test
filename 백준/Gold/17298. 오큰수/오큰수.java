import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        int T = Integer.parseInt(reader.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] numbers = new int[T];
        int[] answer = new int[T];
        int depth = 1;

        stringTokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < T; i++) {
            numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        stack.push(0);
        answer[T-1] = -1;

        while(depth < T) {
            int num = numbers[depth];
            int top = stack.peek();

            if(numbers[top] < num) {
                answer[top] = num;
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(depth);
                    depth +=1;
                }
            }else {
                stack.push(depth);
                depth +=1;
            }
        }

        while(!stack.isEmpty()){
            answer[stack.pop()] = -1;
        }

        for(int i: answer) {
            writer.write(i + " ");
        }

        writer.flush();
        writer.close();
    }
}
