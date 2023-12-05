import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

        public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String[] input = reader.readLine().split(" ");
                int n = Integer.parseInt(input[0]);
                int k = Integer.parseInt(input[1]);
                int[][] map = new int[7][2];

                for (int i = 0; i < n; i++) {
                        String[] stdInfo = reader.readLine().split(" ");
                        int gender = Integer.parseInt(stdInfo[0]);
                        int grade = Integer.parseInt(stdInfo[1]);

                        map[grade][gender] += 1;
                }

                int result = 0;
                for (int[] ints : map) {
                        int w = (int) Math.ceil((ints[0]) / (double) k);
                        int m = (int) Math.ceil((ints[1]) / (double) k);
                        result += w;
                        result += m;
                }

                System.out.println(result);
        }
}
