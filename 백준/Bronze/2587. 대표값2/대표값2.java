import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int[] tmp = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
            sum += arr[i];
        }

        mergeSort(arr, tmp, 0, 4);

        System.out.println(sum / 5);
        System.out.println(arr[arr.length / 2]);
    }

    public static void mergeSort(int[] arr, int[] tmp, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;
        mergeSort(arr, tmp, left, mid);
        mergeSort(arr, tmp, mid + 1, right);
        merge(arr, tmp, left, right, mid);
    }

    public static void merge(int[] arr, int[] tmp, int left, int right, int mid) {
        int p = left;
        int q = mid + 1;
        int idx = p;

        for (int i = left; i <= right; i++) {
            tmp[i] = arr[i];
        }

        while (p <= mid && q <= right) {
            if (tmp[p] >= tmp[q]) {
                arr[idx] = tmp[q];
                q++;
                idx++;
            } else {
                arr[idx] = tmp[p];
                p++;
                idx++;
            }
        }

        while (p <= mid) {
            arr[idx] = tmp[p];
            p++;
            idx++;
        }

        while (q <= right) {
            arr[idx] = tmp[q];
            q++;
            idx++;
        }
    }
}
