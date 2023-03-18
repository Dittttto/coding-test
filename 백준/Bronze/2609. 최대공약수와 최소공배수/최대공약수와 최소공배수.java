import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int a = Integer.parseInt(srt.nextToken());
        int b = Integer.parseInt(srt.nextToken());
        int gcd = getGcd(a,b);
        int lcm = (a * b )/ gcd;

        System.out.println(gcd);
        System.out.println(lcm);

    }

    static int getGcd(int a, int b){
        if(b == 0) {
            return a;
        }

        return getGcd(b, a%b);
    }
}
