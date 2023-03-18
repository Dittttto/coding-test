import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int T = Integer.parseInt(srt.nextToken());

        for (int i = 0; i < T; i++) {
            String[] scores = reader.readLine().split("");
            int result = 0;
            int temp = 0;
            for(String score: scores) {
                if(score.equals("X")){
                    temp = 0;
                }else {
                    temp = temp + 1;
                }

                result += temp;
            }

            System.out.println(result);
        }
    }
}
