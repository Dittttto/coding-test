import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        int target = Integer.parseInt(reader.readLine());
        int cnt = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int cur = arr[right] + arr[left];

            if(cur == target) {
                cnt++;
                left++;
            }else if(cur > target) {
                right--;
            }else if(cur < target) {
                left++;
            }
        }
        System.out.println(cnt);
    }
}
