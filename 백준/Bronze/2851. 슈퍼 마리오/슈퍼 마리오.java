import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                        int num = Integer.parseInt(reader.readLine());
                        if (Math.abs(100 - sum) < Math.abs(100 - (sum + num))) {
                                break;
                        }

                        sum += num;
                }

                System.out.println(sum);
        }
}
