import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 0;
        int max = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;
        for (int i = 0; i < 9; i++) {
            int[] tmp = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < tmp.length; j++) {
                if(tmp[j] > max) {
                    max = tmp[j];
                    x = n;
                    y = j;
                }
            }
            n++;
        }

        writer.write(max + "\n");
        writer.write((x+1) + " " + (y+1));
        writer.flush();
        writer.close();
    }
}
