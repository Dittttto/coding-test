import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        int[] arr = new int[T];
        int idx =0;
        for(String num: reader.readLine().split(" ")) {
            arr[idx++] = Integer.parseInt(num);
        }
        
        boolean hasNext = nextPermutation(arr, T);
        if(!hasNext) {
            System.out.println(-1);
            return;
        }

        for(int num: arr) {
            System.out.print(num + " ");
        }

    }

    public static boolean nextPermutation(int[] arr, int N) {
        int i = N-1;
        while(i > 0 && arr[i-1] > arr[i]) i-=1;
        if(i == 0) return false;
        int j = N-1;
        while(arr[i-1] > arr[j]) j-=1;
        swap(arr, i-1, j);
        j = N-1;
        while(i < j) {
            swap(arr, i, j);
            i+=1;
            j-=1;
        }

        return true;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
