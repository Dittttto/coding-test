import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

        public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int n = Integer.parseInt(reader.readLine());
                Stream<String> nums = Arrays.stream(reader.readLine().split(" "));
                String v = reader.readLine();
                long count = nums.filter(num -> num.equals(v)).count();
                System.out.println(count);
        }
}
