import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        insert(arr);
        int sum = 0;
        int dur = 0;
        for (int i : arr) {
            sum += dur + i;
            dur += i;

        }
        System.out.println(sum);
    }

    public static void insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if(arr[j-1] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
    }
}
