import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[][] map = new int[15][15];

        for (int i = 0; i < map.length; i++) {
            map[0][i] = i;
            map[i][0] = 0;
        }

        for (int i = 1; i < map.length; i++) {
            for (int j = 1; j < map.length; j++) {
                map[i][j] = map[i][j-1] + map[i-1][j];
            }
        }

        int n = Integer.parseInt(reader.readLine());
        while(n-- > 0){
            int f = Integer.parseInt(reader.readLine());
            int k = Integer.parseInt(reader.readLine());
            System.out.println(map[f][k]);
        }
    }
}
