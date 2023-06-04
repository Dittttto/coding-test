import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(srt.nextToken());
        int k = Integer.parseInt(srt.nextToken());

        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        quickSort(arr, 0, arr.length -1, k-1);

        System.out.println(arr[k-1]);

    }

    public static void quickSort(int[] arr, int left, int right, int k) {
        if(left >= right) {
            return;
        }

        int pivot = partition(arr, left, right);
        if(pivot == k) {
            return;
        }
        else if(pivot > k){
            quickSort(arr, left, pivot-1, k);
        }else {
            quickSort(arr, pivot+1, right, k);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        if(left + 1 == right) {
            if (arr[left] > arr[right]) swap(arr, left, right);
            return right;
        }

        int mid = left + (right - left) / 2;
        swap(arr, left, mid);
        int pivot = arr[left];
        int i = left+1;
        int j = right;

        while(i <= j) {
            while(arr[j] > pivot && 0 < j) {
                j--; 
            }
            while(arr[i] < pivot && i< arr.length - 1) {
                i++;
            }

            if(i <= j){
                swap(arr, i++, j--);
            }
        }

        arr[left] = arr[j];
        arr[j] = pivot;
        return j;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
