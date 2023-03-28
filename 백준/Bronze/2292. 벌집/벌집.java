import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        int cnt = 1;
        int limit = 1;
        int depth = 1;

        if(N == 1) {
            System.out.println(1);
            return;
        }

        while(true) {
            limit += 6 * depth;
            depth++;
            cnt++;
            if (N <= limit) {
                break;
            }
        }

        System.out.println(cnt);

    }
}
