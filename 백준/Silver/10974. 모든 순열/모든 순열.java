import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());
        int[] arr = new int[N];
        for (int i =1; i <= N; i++) {
            arr[i-1] = i;
        }

        do {
            for(int num: arr) {
                writer.write(num + " ");
            }
            writer.write("\n");
        }while (nextPermutation(arr, N));

        writer.flush();
        writer.close();
    }

    public static boolean nextPermutation(int[] arr, int N) {
        int i = N -1;
        while(i > 0 && arr[i-1] > arr[i]) i-=1;
        if(i == 0) return false;
        int j = N-1;
        while(arr[i-1] >= arr[j]) j-=1;
        swap(arr, i-1, j);
        j = N -1;
        while(i < j) {
            swap(arr, i, j);
            i+=1;
            j -=1;
        }

        return true;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
