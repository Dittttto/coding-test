import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        int depth = 1;
        int result = 0;
        while(true) {
            long num = (long)Math.pow(10, depth) - 1;
            if(num <= N) {
                result += 9 * Math.pow(10, depth-1)*depth;
            }else {
                result += (N - (long)(Math.pow(10, depth-1)-1))*depth;
                break;
            }

            depth++;
        }

        System.out.println(result);
    }
}
