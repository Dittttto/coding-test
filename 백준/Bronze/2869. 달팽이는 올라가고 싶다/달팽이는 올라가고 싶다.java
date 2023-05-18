import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer srt = new StringTokenizer(reader.readLine());

        int a = Integer.parseInt(srt.nextToken());
        int b = Integer.parseInt(srt.nextToken());
        int v = Integer.parseInt(srt.nextToken());

        if(a >= v) {
            System.out.println(1);
            return;
        }

        long day =( v - a) / (a-b) + 1;

        if((v-a) % (a-b) != 0) {
            day += 1;
        }

        writer.write(day + "");
        writer.flush();
        writer.close();
    }
}
