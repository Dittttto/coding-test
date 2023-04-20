import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer srt;
        dp = new int[21][21][21];
        while(true) {
            srt = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(srt.nextToken());
            int b = Integer.parseInt(srt.nextToken());
            int c = Integer.parseInt(srt.nextToken());

            if(a == -1 && b == -1 && c == -1) break;
            writer.write("w("+a+", "+b+", "+c+") = " + w(a,b,c) + "\n");
        }

        writer.flush();
        writer.close();
    }

    public static int w(int a, int b, int c) {
        if(a <= 0 || b <=0 || c <= 0) return 1;
        if( a> 20 || b > 20 || c > 20) return w(20, 20,20);
        if(dp[a][b][c] != 0) return dp[a][b][c];

        if(a < b && b < c) {
            int result = w(a, b, c - 1) + w(a, b - 1, c- 1) - w(a, b - 1, c);
            dp[a][b][c] = result;
            return dp[a][b][c];
        }

        int result = w(a-1,b,c) + w(a-1,b-1,c) + w(a-1,b, c-1) - w(a-1,b-1,c-1);
        dp[a][b][c] = result;
        return dp[a][b][c];
    }
}
