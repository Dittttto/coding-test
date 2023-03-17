import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(srt.nextToken());
        int K = Integer.parseInt(srt.nextToken());

        ArrayList divisors = getDivisor(N);
        if(divisors.size() < K) {
            System.out.println(0);
            return;
        }

        System.out.println(divisors.get(K - 1));


    }

    static ArrayList getDivisor(int number) {
        ArrayList result = new ArrayList();

        for (int i = 1; i <= (int)number /2 ; i++) {
            if(number % i == 0) {
                result.add(i);
            }
        }

        result.add(number);

        return result;
    }
}
