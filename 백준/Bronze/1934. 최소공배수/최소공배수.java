import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int T = Integer.parseInt(srt.nextToken());

        for (int i = 0; i < T; i++) {
            srt = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(srt.nextToken());
            int b = Integer.parseInt(srt.nextToken());
            System.out.println(getLcm(a, b));
        }
    }
    static int getLcm(int a, int b) {
        return (a * b) / getGcd(a,b);
    }
    static int getGcd(int a, int b){
        if(b == 0) {
            return a;
        }

        return getGcd(b, a%b);
    }
}
