import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(srt.nextToken());
        int[] arr = new int[]{0, 0, 0, 0};
        String result = "YES";

        srt = new StringTokenizer(br.readLine());
        if (N <= 4) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(srt.nextToken());
            int lessIdx = -1;

            for (int j = 0; j < 4; j++) {
                if (arr[j] < num) {
                    lessIdx = j;
                    break;
                }
            }

            if (lessIdx != -1) {
                arr[lessIdx] = num;
            } else {
                result = "NO";
                break;
            }
        }

        System.out.println(result);
    }
}
