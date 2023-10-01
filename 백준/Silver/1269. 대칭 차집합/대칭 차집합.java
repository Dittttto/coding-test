import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        Set<String> setA = Arrays.stream(reader.readLine().split(" ")).collect(Collectors.toSet());
        Set<String> setB = Arrays.stream(reader.readLine().split(" ")).collect(Collectors.toSet());

        int resultA = setA.size();
        int resultB = setB.size();

        for (String s : setA) {
            if (setB.contains(s)) {
                resultA -= 1;
            }
        }

        for (String s : setB) {
            if (setA.contains(s)) {
                resultB -= 1;
            }
        }

        System.out.println(resultB + resultA);
    }
}
