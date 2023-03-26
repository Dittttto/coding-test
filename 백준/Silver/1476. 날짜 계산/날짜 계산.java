import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int E = Integer.parseInt(srt.nextToken());
        int S = Integer.parseInt(srt.nextToken());
        int M = Integer.parseInt(srt.nextToken());
        if(E == 1 && S == 1 && M == 1) {
            System.out.println(1);
            return;
        }

        int cnt = 2;
        while (cnt % 15 != E % 15 || cnt % 28 != S % 28 || cnt % 19 != M % 19) {
            cnt++;
        }
        System.out.println(cnt);
    }
}
