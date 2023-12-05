import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

        public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String nums = reader.readLine();
                int[] alphabet = new int[26];
                for (char c : nums.toCharArray()) {
                        alphabet[c - 'a'] += 1;
                }

                for (int i : alphabet) {
                        System.out.print(i + " ");
                }
        }
}
