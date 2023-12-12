import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        static int[] list;
        static StringBuilder sb;

        public static void main(String[] args) throws IOException {
                int n = Integer.parseInt(reader.readLine());
                list = new int[n];
                for (int i = 0; i < n; i++) {
                        list[i] = Integer.parseInt(reader.readLine());
                }

                Arrays.sort(list);

                sb = new StringBuilder();
                for (int i : list) {
                        sb.append(i).append("\n");
                }

                System.out.println(sb);
        }
}
