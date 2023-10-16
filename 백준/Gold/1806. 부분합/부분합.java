import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nums = reader.readLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);
        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int minLength = Integer.MAX_VALUE;
        int value = arr[0];
        int left =0;
        int right = 0;
        boolean hasValue = false;
        int result = 0;


        while(right < n) {
            if (value < m) {
                right += 1;
                if (right >= n) break;
                value += arr[right];
            }else {
                minLength = Math.min(minLength, right - left + 1);
                value -= arr[left];
                left += 1;
                hasValue = true;
            }
        }


        if (hasValue) {
            result = minLength;
        }

        writer.write(result + "");
        writer.flush();
        writer.close();
    }
}
