import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());

        int M = Integer.parseInt(srt.nextToken());
        int N = Integer.parseInt(srt.nextToken());
        int pn = 0;
        int[] primes = new int[N+1];
        boolean[] checked = new boolean[N+1];

        for (int i = 2; i <= N; i++) {
            if(!checked[i]) {
                primes[pn++] = i;
                for (int j = i+i; j <= N; j+=i) {
                    checked[j] = true;
                }
            }
        }

        for (int i = 0; i < pn; i++) {
            if(primes[i] >= M) {
                System.out.println(primes[i]);
            }
        }
    }
}
