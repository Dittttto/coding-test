import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

        public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String nums = reader.readLine();
                int[] cnt = new int[10];

                for (char c : nums.toCharArray()) {
                        cnt[c -'0'] += 1;
                }

                cnt[6] = (int)Math.ceil( (double) (cnt[6] + cnt[9]) / 2);


                int max = 0;

                for (int i = 0; i < 9 ; i++) {
                        if (max < cnt[i]) max = cnt[i];
                }

                System.out.println(max);
        }
}
