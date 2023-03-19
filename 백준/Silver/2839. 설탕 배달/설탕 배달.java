import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int W = Integer.parseInt(reader.readLine());
        HashSet<Integer> memo = new HashSet<>();
        int cnt = calc(W, 0, memo);

        if(cnt > W) {
            System.out.println(-1);
            return;
        }

        System.out.println(cnt);
    }

    static int calc(int a, int num, HashSet<Integer> memo) {
        if(a == 0) {
            return num;
        }

        if( a < 0 || memo.contains(a)) {
            return Integer.MAX_VALUE;
        }


        int numA  = calc(a - 5, num + 1, memo);
        memo.add(a-5);
        int numB = calc(a - 3, num + 1, memo);
        memo.add(a-3);

        return Math.min(numA, numB);
    }
}
