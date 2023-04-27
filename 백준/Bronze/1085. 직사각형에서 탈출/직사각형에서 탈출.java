import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());

        int x =Integer.parseInt(srt.nextToken());
        int y =Integer.parseInt(srt.nextToken());
        int w =Integer.parseInt(srt.nextToken());
        int h =Integer.parseInt(srt.nextToken());

        System.out.println(Math.min(Math.min(x, w-x), Math.min(y, h - y)));
    }
}
