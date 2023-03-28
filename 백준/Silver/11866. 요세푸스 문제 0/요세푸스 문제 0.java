import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(srt.nextToken());
        int K = Integer.parseInt(srt.nextToken());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <=N ; i++) {
            list.add(i);
        }

        int idx = 0;
        writer.write("<");
        while(list.size() > 0) {
            idx = (idx + K-1)%list.size();
            int pop = list.remove(idx);
            writer.write(pop + "");
            if (list.size() > 0) {
                writer.write(", ");
            }
        }
        writer.write(">");

        writer.flush();
        writer.close();
    }
}
