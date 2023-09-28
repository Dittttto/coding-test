import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int num = Integer.parseInt(input[2]);

        int kx = input[0].charAt(1) - '0';
        int ky = input[0].charAt(0) - 'A';

        int sx = input[1].charAt(1) - '0';
        int sy = input[1].charAt(0) - 'A';
        
        int[] dx = new int[]{1, 1, 0, -1, -1, -1, 0, 1};
        int[] dy = new int[]{0, 1, 1, 1, 0, -1, -1, -1};
        for (int i = 0; i < num; i++) {
            String direction = reader.readLine();
            int idx = convertDirectionCode(direction);

            int curX = kx + dx[idx];
            int curY = ky + dy[idx];

            if (curX < 1 || curX > 8) continue;
            if (curY < 0 || curY >= 8) continue;

            if (curX == sx && curY == sy) {
                int nextSx = sx + dx[idx];
                int nextSy = sy + dy[idx];

                if (nextSx < 1 || nextSx > 8) continue;
                if (nextSy < 0 || nextSy >= 8) continue;

                sx = nextSx;
                sy = nextSy;
            }

            kx = curX;
            ky = curY;
        }

        System.out.println((char) (ky + 'A') + "" + kx);
        System.out.println((char) (sy + 'A') + "" + sx);
    }

    private static int convertDirectionCode(String d) {
        switch (d) {
            case "T":
                return 0;
            case "RT":
                return 1;
            case "R":
                return 2;
            case "RB":
                return 3;
            case "B":
                return 4;
            case "LB":
                return 5;
            case "L":
                return 6;
            default:
                return 7;
        }
    }
}
