import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int n =  Integer.parseInt(srt.nextToken());
        int m =  Integer.parseInt(srt.nextToken());

        long[] s = new long[n];
        long[] c = new long[m];

        srt = new StringTokenizer(reader.readLine());
        s[0] = Integer.parseInt(srt.nextToken());
        for (int i = 1; i < n; i++) {
            s[i] = s[i-1] +  Integer.parseInt(srt.nextToken());
        }

        long result = 0;
        for (int i = 0; i <n ; i++) {
            int tmp = (int)(s[i] % m);

            if(tmp == 0) result += 1;

            c[tmp] += 1;
        }

        for (long cnt : c) {
            if(cnt > 1) {
                result += (cnt * (cnt - 1) / 2);
            }
        }

        System.out.println(result);
    }
}
