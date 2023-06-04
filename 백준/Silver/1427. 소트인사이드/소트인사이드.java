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
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[min]) {
                    min = j;
                }
            }
            if(arr[i] < arr[min]){
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
    }
}
