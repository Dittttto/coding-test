import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int result = 0;
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(srt.nextToken());
            result += Math.pow(num, 2);
        }

        System.out.println(result%10);
    }
}
