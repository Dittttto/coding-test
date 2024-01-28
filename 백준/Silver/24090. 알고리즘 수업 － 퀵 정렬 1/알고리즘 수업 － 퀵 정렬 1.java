import java.io.*;
import java.util.Arrays;

public class Main {
    private static int count = 0;
    private static int target;
    private static int[] temp;
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int[] input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        target = input[1];
        sortQuick(arr, 0, arr.length - 1);
        if (target > count) {
            writer.write(-1 + "");
            writer.flush();

        }
        writer.close();
        reader.close();
    }

    private static void sortQuick(int[] arr, int left, int right) throws IOException {
        if (left >= right) return;
        
        int pivotIdx = partition(arr, left, right);
        sortQuick(arr, left, pivotIdx - 1);
        sortQuick(arr, pivotIdx + 1, right);
    }

    private static int partition(int[] arr, int left, int right) throws IOException {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i += 1;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                count += 1;
                if (count == target) {
                    if (arr[i] <= arr[j]) {
                        writer.write(arr[i] + " " + arr[j]);
                    } else {
                        writer.write(arr[j] + " " + arr[i]);
                    }
                    writer.flush();
                    writer.close();
                    System.exit(0);
                }
            }

        }

        if (i + 1 != right) {
            int temp = arr[i + 1];
            arr[i + 1] = arr[right];
            arr[right] = temp;
            count += 1;
            if (count == target) {
                if (arr[i + 1] <= arr[right]) {
                    writer.write(arr[i + 1] + " " + arr[right]);
                } else {
                    writer.write(arr[right] + " " + arr[i + 1]);
                }
                writer.flush();
                writer.close();
                System.exit(0);
            }
        }

        return i + 1;
    }

}
