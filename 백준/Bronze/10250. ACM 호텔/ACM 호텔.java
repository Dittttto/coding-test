import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt;
        int T = Integer.parseInt(reader.readLine());
        while(T-- > 0) {
            srt = new StringTokenizer(reader.readLine());
            int H = Integer.parseInt(srt.nextToken());
            int W = Integer.parseInt(srt.nextToken());
            int M = Integer.parseInt(srt.nextToken());

            int fN = M % H;
            int rN = M / H;

            if(fN != 0) {
                rN += 1;
            }else {
                fN = H;
            }

            System.out.printf("%d%02d\n", fN, rN);
        }
    }
}
