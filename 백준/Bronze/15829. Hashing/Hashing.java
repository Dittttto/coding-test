import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        char[] arr = reader.readLine().toCharArray();
        long m = 1234567891L;
        int r = 31;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += ((arr[i] - 'a' + 1) * Math.pow(r, i));
        }
        System.out.println(sum % m);
    }
}
