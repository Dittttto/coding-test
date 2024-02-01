import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<String> words = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            words.add(reader.readLine());
        }

        words.sort((o1, o2) -> {
            if (o1.length() == o2.length()) {
                int sumO1 = 0;
                for (char c : o1.toCharArray()) {
                    if (c >= '0' && c <= '9') {
                        sumO1 += c - '0';
                    }
                }

                int sumO2 = 0;
                for (char c : o2.toCharArray()) {
                    if (c >= '0' && c <= '9') {
                        sumO2 += c -'0';
                    }
                }
                if (sumO1 == sumO2) {
                    for (int i = 0; i < o1.length(); i++) {
                        if (o1.charAt(i) != o2.charAt(i)){
                            return o1.charAt(i) - o2.charAt(i);
                        }
                    }

                    return 0;
                }
                return sumO1 - sumO2;
            }

            return o1.length() - o2.length();
        });

        for (String word : words) {
            System.out.println(word);
        }
    }
}
