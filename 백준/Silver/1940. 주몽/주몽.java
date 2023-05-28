import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N ; j++) {
                if(arr[i] +  arr[j] == M) {
                    cnt++;
                }else if(arr[i] + arr[j] > M) break;
            }
        }

        System.out.println(cnt);
    }
}
