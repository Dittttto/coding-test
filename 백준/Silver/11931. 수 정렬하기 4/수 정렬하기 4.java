import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        static List<Integer> list;
        static StringBuilder sb;

        public static void main(String[] args) throws IOException {
                int n = Integer.parseInt(reader.readLine());
                list = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                        list.add(Integer.parseInt(reader.readLine()));
                }

                list.sort(Comparator.reverseOrder());
                sb = new StringBuilder();
                for (int i : list) {
                        sb.append(i).append("\n");
                }

                System.out.println(sb);
        }
}
