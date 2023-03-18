import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int T = Integer.parseInt(srt.nextToken());
        int pn = 0;

        srt = new StringTokenizer(reader.readLine());
        for (int i = 0; i < T; i++) {
            int number = Integer.parseInt(srt.nextToken());

            if(number < 2) {
                continue;
            }

            boolean isPrime = true;
            for (int j = 2; j * j <= number ; j++) {
                if(number % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                pn +=1;
            }
        }

        System.out.println(pn);
    }
}
