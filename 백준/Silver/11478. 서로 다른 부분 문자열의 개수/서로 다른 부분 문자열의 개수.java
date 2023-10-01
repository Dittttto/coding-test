import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("");
        Set<String> set = Arrays.stream(input).collect(Collectors.toSet());
        
        for (int i = 0; i < input.length; i++) {
            StringBuilder sb = new StringBuilder(input[i]);
            for (int j = i + 1; j < input.length; j++) {
                sb.append(input[j]);
                set.add(sb.toString());
            }
        }

        System.out.println(set.size());
    }
}
