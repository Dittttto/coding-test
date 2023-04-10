import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int c = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        boolean flag = false;
        for (int i = n; i <= 100 ; i++) {
            if(arr[0] * i + arr[1] > c * i) {
                flag = true;
                break;
            }
        }

        System.out.println(flag ? 0: 1);
    }
}
