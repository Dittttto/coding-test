import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                List<String> list = Arrays.asList("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");

                int cnt = 0;
                for (String key : list) {
                        if (input.contains(key)) {
                                String temp = input.replace(key, " ");
                                for (char c : temp.toCharArray()) {
                                        if (c == ' ') {
                                                cnt++;
                                        }
                                }
                                input = temp.replace(" ", "_");
                        }

                }

                cnt += input.replace("_", "").length();
                System.out.println(cnt);
        }
}
