import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(reader.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        StringBuilder sb = new StringBuilder();
        select(arr);
        for (int i : arr) {
            sb.append(i);
        }

        System.out.println(sb.toString());
    }
    public static void select(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MIN_VALUE;
            int minI = 0;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] > min) {
                    min = arr[j];
                    minI = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[minI];
            arr[minI] = tmp;
        }
    }
}
