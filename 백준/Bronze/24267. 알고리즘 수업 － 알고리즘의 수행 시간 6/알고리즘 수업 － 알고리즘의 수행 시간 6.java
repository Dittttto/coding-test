import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        long[] arr = new long[(int) (n+1)];
        Long result = 0L;
        for(int i = 1; i <= n-2; i++){
            arr[i] = i+arr[i-1];
        }

        for (long num: arr) {
            result += num;
        }
        System.out.println(result);
        System.out.println(3);
    }
}