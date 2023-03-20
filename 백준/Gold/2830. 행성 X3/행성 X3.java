import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        int[] numbers = new int[T];
        for (int i = 0; i < T; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        int[] digit = new int[30];

        for(int num : numbers) {
            int temp = num;
            int cnt = 0;
            while(temp > 0){
                digit[cnt] += temp %2;
                temp /= 2;
                cnt++;
            }
        }

        long result = 0L;

        for (int i = 0; i < digit.length; i++) {
            result += ((long) (T - digit[i]) * digit[i]) * (1<<i);
        }

        System.out.println(result);
    }
}
