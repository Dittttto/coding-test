import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String num = reader.readLine();

                if (!num.contains("0")) {
                        System.out.println(-1);
                        return;
                }

                int sum = 0;

                for(char n: num.toCharArray()) {
                        sum += (int) n;
                }

                if(sum % 3 != 0) {
                        System.out.println(-1);
                        return;
                }

                String result = Arrays.stream(num.split("")).sorted(Comparator.reverseOrder())
                        .collect(Collectors.joining());
                System.out.println(result);
        }

}
