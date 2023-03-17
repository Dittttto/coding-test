import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int prev = Integer.parseInt(srt.nextToken());
        int diff = 0 ;

        for (int i = 1; i < 8; i++) {
            int data = Integer.parseInt(srt.nextToken());
            diff = prev - data;
            if(Math.abs(diff) > 1) {
                System.out.println("mixed");
                return;
            }

            prev = data;
        }

        String result = diff > 0 ? "descending" : "ascending";
        System.out.println(result);
    }
}
