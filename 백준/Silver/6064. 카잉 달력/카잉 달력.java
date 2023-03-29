import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer srt;
        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            srt = new StringTokenizer(reader.readLine());
            int M = Integer.parseInt(srt.nextToken());
            int N = Integer.parseInt(srt.nextToken());
            int x = Integer.parseInt(srt.nextToken());
            int y = Integer.parseInt(srt.nextToken());

            x -= 1;
            y -= 1;
            boolean find = false;
            for (int j = x; j < N * M;  j += M) {
                if(j%N == y) {
                    find = true;
                    writer.write(j+1 + "\n");
                    break;
                }
            }

            if (!find){
                writer.write(-1 + "\n");
            }
        }

        writer.flush();
        writer.close();
    }
}
