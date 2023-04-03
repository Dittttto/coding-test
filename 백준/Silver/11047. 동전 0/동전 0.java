import java.util.*;
import java.io.*;
class Solution11047 {
    int N;
    int M;
    int[] coins;
    public Solution11047() {}
    public void read() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        N = Integer.parseInt(srt.nextToken());
        M = Integer.parseInt(srt.nextToken());
        coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(reader.readLine());
        }


    }

    public long run() {
        long result = 0;

        for (int i = N-1; i >= 0 ; i--) {
            if(M == 0) break;
            result += M/coins[i];
            M %= coins[i];
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        Solution11047 solution11047 = new Solution11047();
        solution11047.read();
        System.out.println(solution11047.run());
    }
}
