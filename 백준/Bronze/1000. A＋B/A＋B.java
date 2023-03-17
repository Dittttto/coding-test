import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer srt = new StringTokenizer(reader.readLine());

        writer.write(((Integer.parseInt(srt.nextToken())) + Integer.parseInt(srt.nextToken())) +"\n");
        writer.flush();
        writer.close();
    }
}
