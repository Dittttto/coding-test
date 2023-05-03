import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {

            ArrayList<Integer> list = new ArrayList<>();
            for (String num : reader.readLine().split(" ")) {
                list.add(Integer.parseInt(num));
            }

            list.sort(Comparator.naturalOrder());

            long a = list.get(0);
            long b = list.get(1);
            long c = list.get(2);
            if (a+b+c == 0) break;

            if ((a * a + b * b) == c * c) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }
    }
}
