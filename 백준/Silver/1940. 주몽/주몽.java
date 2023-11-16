import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int n = Integer.parseInt(reader.readLine());
                int m = Integer.parseInt(reader.readLine());
                int[] nums = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                Arrays.sort(nums);

                int i = 0;
                int j = n - 1;
                int result = 0;

                while (j > i) {
                        if (nums[j] + nums[i] < m) {
                                i += 1;
                        }else if(nums[j] + nums[i] > m) {
                                j -= 1;
                        }else {
                                result += 1;
                                j -= 1;
                                i += 1;
                        }
                }

                System.out.println(result);

        }
}
