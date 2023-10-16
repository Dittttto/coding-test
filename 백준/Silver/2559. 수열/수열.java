import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nums = reader.readLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);
        int[] temp = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxValue;
        int value = 0;
        int left =0;
        int right = left + m - 1;

        for (int i = 0; i < m; i++) {
            value += temp[i];
        }

        maxValue = value;

        while(right < n) {
            value -= temp[left];
            left += 1;
            right += 1;
            if (right >= n) break;
            value += temp[right];
            maxValue = Math.max(maxValue, value);
        }


        writer.write(maxValue + "");
        writer.flush();
        writer.close();
    }
}
