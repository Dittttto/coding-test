import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[][] map = new int[n][n];
        System.out.println(go(map, 0));
    }

    public static int go(int[][] map, int depth) {
        if(depth == map.length) {
            return 1;
        }

        int result = 0;
        for (int i = 0; i < map.length; i++) {
            if(!isValid(map, depth, i)) continue;
            map[depth][i] = 1;
            result += go(map, depth+1);
            map[depth][i] = 0;
        }

        return result;
    }

    public static boolean isValid(int[][] map, int depth, int cur) {
        for (int i = 0; i < depth; i++) {
            if(map[i][cur] == 1) return false;
        }

        for (int i = 1; i <= depth; i++) {
            if(depth - i < 0 || cur - i < 0) continue;
            if(map[depth - i][cur-i] == 1) return false;
        }

        for (int i = 1; i <= depth; i++) {
            if(depth - i < 0 || cur + i >= map.length) continue;
            if(map[depth - i][cur+i] == 1) return false;
        }

        return true;
    }
}
