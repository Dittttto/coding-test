import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String input = reader.readLine();
            if (input.equals("#")){
                break;
            }

            Set<Character> sets = new HashSet<>();
            for(Character c: input.toLowerCase().toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    sets.add(c);
                }
            }

            System.out.println(sets.size());

        }
    }
}
