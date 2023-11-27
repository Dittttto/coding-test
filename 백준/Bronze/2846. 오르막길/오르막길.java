import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int n = Integer.parseInt(reader.readLine());
                int[] nums = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                if (nums.length == 1) {
                        System.out.println(0);
                        return;
                }

                int left = 0;
                int right = 1;
                int max = 0;
                while (right < n) {
                        if (nums[right] > nums[right -1]) {
                                right += 1;
                                if(right >= n) {
                                        max = Math.max(max, nums[right -1] - nums[left]);
                                        break;
                                }
                        } else {
                                max = Math.max(max, nums[right -1] - nums[left]);
                                left = right;
                                right += 1;
                        }
                }

                System.out.println(max);
        }
}
