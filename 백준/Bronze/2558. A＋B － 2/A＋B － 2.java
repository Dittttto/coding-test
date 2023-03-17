import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int a = Integer.parseInt(srt.nextToken());
        srt = new StringTokenizer(reader.readLine());
        int b = Integer.parseInt(srt.nextToken());

        writer.write((a+b) +"\n");
        writer.flush();
        writer.close();
    }
}
