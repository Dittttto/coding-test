import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer srt;
        String input = reader.readLine();

        while(input != null){
            srt = new StringTokenizer(input);
            int A = Integer.parseInt(srt.nextToken());
            int B = Integer.parseInt(srt.nextToken());
            writer.write((A+B) + "\n");
            input = reader.readLine();
        }

        writer.flush();
        writer.close();
    }
}
