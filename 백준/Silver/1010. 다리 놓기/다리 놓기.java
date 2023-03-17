import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(srt.nextToken());
        int[][] dots = new int[t][2];

        for (int i = 0; i < t; i++) {
            srt = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(srt.nextToken());
            int M = Integer.parseInt(srt.nextToken());
            dots[i] =  new int[]{M,N};
        }

        for(int[] arr: dots) {
            System.out.println(calcCombination(arr[0], arr[1]));
        }

    }

    static BigInteger calcCombination(int n, int r) {
        BigInteger b = BigInteger.ONE;
        for (int i = n; i >= n - r + 1 ; i--) {
            b = b.multiply(BigInteger.valueOf(i));

        }
        for(int j = 1; j <= r; j++) {
            b = b.divide(BigInteger.valueOf(j));

        }

        return b;
    }
}
