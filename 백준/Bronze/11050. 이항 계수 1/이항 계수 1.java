import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(srt.nextToken());
        int m = Integer.parseInt(srt.nextToken());

        long result = 1;
        for(int i = n ; i > (n-m); i--) {
            result *= i;
        }

        for(int i = 1; i<= m;i++) {
            result /= i;
        }

        System.out.println(result);
    }
}
