import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        int[] tmp = new int[n];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(reader.readLine());
            list.add(num);
            arr[i] = num;
        }
        mergeSort(arr, tmp, 0, arr.length -1);
        for(int num: arr) {
            writer.write(num + "\n");
        }

        writer.flush();
        writer.close();
    }

    public static void mergeSort(int[] arr, int[] tmp, int left, int right) {
        if(left >= right){
            return;
        }

        int mid = left + (right - left) / 2;
        mergeSort(arr, tmp, left, mid);
        mergeSort(arr, tmp, mid+1, right);
        merge(arr, tmp, left, right, mid);
    }

    public static void merge(int[] arr, int[] tmp, int left, int right, int mid) {
        int p = left;
        int q = mid +1;
        int idx = left;

        while(p <= mid || q <= right) {
            if(p <= mid && q <= right) {
                if(arr[p] <= arr[q]) {
                    tmp[idx++] = arr[p++];
                }else {
                    tmp[idx++] = arr[q++];
                }
            }else if(p <= mid && q > right) {
                tmp[idx++] = arr[p++];
            }else {
                tmp[idx++] = arr[q++];
            }
        }

        for (int i = left; i <= right; i++) {
            arr[i] = tmp[i];
        }
    }
}
