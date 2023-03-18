import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int T = Integer.parseInt(srt.nextToken());

        for (int i = 0; i < T; i++) {
            srt = new StringTokenizer(reader.readLine());
            int R = Integer.parseInt(srt.nextToken());
            String[] strings = srt.nextToken().split("");
            String result = "";

            for(String string: strings) {
                String temp = "";
                for (int j = 0; j < R; j++) {
                    temp += string;
                }

                result += temp;
            }

            System.out.println(result);
        }
    }
}
