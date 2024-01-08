import java.io.*;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

// 핵심 아이디어
// isReverse 와 인덱스를 통해 배열을 자른다

public class Main {
    static final String MEMO = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb;
    static boolean[][] visited;
    static int[][] map;

    static int n;
    static int m;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        String[] input = reader.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        String result = convert(m, n);
        writer.write(result);
        writer.flush();
        writer.close();
    }

    private static String convert(int num, int base) {
        int remainder = num % base;
        int share = num / base;
        if(share == 0) {
            return String.valueOf(MEMO.charAt(remainder));
        }

        return convert(share, base) + MEMO.charAt(remainder);
    }
}
// boxing 비용까지 아껴야 한다.
// List<Integer> 의 경우 Integer 로 박싱이 된다.
