import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(srt.nextToken());
        int X = Integer.parseInt(srt.nextToken());

        srt = new StringTokenizer(reader.readLine());
        int depth = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(srt.nextToken());
            if(num < X) {
                if(depth > 0) {
                    System.out.print(" ");
                }

                System.out.print(num);
                depth++;
            }
        }
    }
}
