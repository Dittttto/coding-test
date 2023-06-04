import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        sort(arr);

        for (int i : arr) {
            writer.write(i + "\n");
        }

        writer.flush();
        writer.close();
    }
    
    public static void sort(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1 ; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    swap = true;
                }
            }

            if (!swap) break;
        }
    }
}
