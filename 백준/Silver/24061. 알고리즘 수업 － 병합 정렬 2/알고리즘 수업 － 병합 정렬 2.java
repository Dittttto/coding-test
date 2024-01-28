import java.io.*;
import java.util.Arrays;

public class Main {
    private static int count = 0;
    private static int target;
    private static int[] temp;
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] input = reader.readLine().split(" ");
        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        temp = new int[Integer.parseInt(input[0])+1];
        target = Integer.parseInt(input[1]);
        sort(arr, 0, arr.length-1);
        System.out.println(-1);
        reader.close();
    }

    private static void sort(int[] arr, int left, int right) throws IOException {
        if (left < right) {
            int middle = left + (right - left) / 2;
            sort(arr, left, middle);
            sort(arr, middle+1, right);
            merge(arr, left, middle, right);
        }
    }

    private static void merge(int[] arr, int left, int middle, int right) throws IOException {
        int i = left;
        int j = middle + 1;
        int k = 0;
        while (i <= middle && j <= right){
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        while(i <= middle) {
            temp[k++] = arr[i++];
        }

        while(j <= right) {
            temp[k++] = arr[j++];
        }

        i = left;
        k = 0;

        while(i <= right) {
            count += 1;
            arr[i++] = temp[k++];
            if (count == target){
                for (int i1 : arr) {
                    writer.write(i1 + " ");
                }
                writer.flush();
                writer.close();
                System.exit(0);
                return;
            }
        }
    }
}
