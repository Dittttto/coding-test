import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(srt.nextToken());
        int m = Integer.parseInt(srt.nextToken());
        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] s = new int[n];
        s[0] = arr[0];
        for (int i = 1; i < n; i++) {
            s[i] = s[i - 1] + arr[i];
        }

        for (int i = 0; i < m; i++) {
            srt = new StringTokenizer(reader.readLine());
            int l = Integer.parseInt(srt.nextToken())-1;
            int r = Integer.parseInt(srt.nextToken())-1;
            int result = l > 0 ? s[r] - s[l-1] : s[r];
            writer.write(result + "\n");
        }

        writer.flush();
        writer.close();
    }
}
