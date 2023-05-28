import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);
        int cnt = 0;
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            if(arr[left] + arr[right] == M) {
                cnt++;
                left++;
                right--;
            }else if(arr[left] + arr[right] > M) {
                right--;
            }else {
                left++;
            }
        }

        System.out.println(cnt);
    }
}
