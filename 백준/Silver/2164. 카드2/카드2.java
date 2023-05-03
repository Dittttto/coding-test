import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        Deque<Integer> que = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            que.offerLast(i);
        }

         while(que.size() > 1) {
             que.pollFirst();
             if(!que.isEmpty()){
                 int second = que.pollFirst();
                 que.offerLast(second);
             }
         }

         System.out.println(que.pollFirst());
    }
}
