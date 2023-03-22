import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(srt.nextToken());
        int S = Integer.parseInt(srt.nextToken());

        srt = new StringTokenizer(reader.readLine());
        int[] ni = new int[N];
        for (int i = 0; i < N; i++) {
            ni[i] = Math.abs(S - Integer.parseInt(srt.nextToken()));
        }

        int prevGcd = 0;
        for (int i = 0; i < N; i++) {
            if(i == 0) {
                prevGcd = gcd(ni[i], ni[i]);
            }else {
                prevGcd = gcd(prevGcd, ni[i]);
            }
        }

        System.out.println(prevGcd);
    }

    static int gcd(int a, int b) {
        if(b == 0){
            return a;
        }

        return gcd(b, a%b);
    }
}
