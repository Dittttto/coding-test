import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = -999; i <=999 ; i++) {
            boolean find = false;
            for (int j = -999; j <= 999; j++) {
                if((arr[0] * i + arr[1] * j == arr[2]) && (arr[3]*i + arr[4]*j== arr[5])){
                    System.out.println(i + " " + j);
                    find = true;
                    break;
                }
            }

            if(find) break;
        }
    }
}
