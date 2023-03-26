import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        String[][] map = new String[N][];

        for (int i = 0; i < N; i++) {
            String[] row = reader.readLine().split("");
            map[i] = row;
        }

        int totalCnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N; j++) {
                if(!map[i][j-1].equals(map[i][j])) {
                    String temp = map[i][j-1];
                    map[i][j-1] = map[i][j];
                    map[i][j] = temp;
                    int cntRow = searchRow(map);
                    int cntColumn = searchColumn(map);
                    int tempCnt = Math.max(cntRow, cntColumn);

                    if(totalCnt < tempCnt) {
                        totalCnt = tempCnt;
                    }

                    temp = map[i][j-1];
                    map[i][j-1] = map[i][j];
                    map[i][j] = temp;
                }

                if(!map[j-1][i].equals(map[j][i])) {
                    String temp = map[j-1][i];
                    map[j-1][i] = map[j][i];
                    map[j][i] = temp;
                    int cntRow = searchRow(map);
                    int cntColumn = searchColumn(map);
                    int tempCnt = Math.max(cntRow, cntColumn);

                    if(totalCnt < tempCnt) {
                        totalCnt = tempCnt;
                    }

                    temp = map[j-1][i];
                    map[j-1][i] = map[j][i];
                    map[j][i] = temp;
                }
            }
        }

        System.out.println(totalCnt);
    }

    static int searchRow(String[][] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 1;
            for (int j = 1; j < arr.length; j++) {
                if(arr[i][j-1].equals(arr[i][j])) {
                    temp++;
                }else {
                    if(cnt < temp) {
                        cnt = temp;
                    }

                    temp = 1;
                }
            }
            if(temp > cnt) {
                cnt = temp;
            }
        }
        return cnt;
    }
    static int searchColumn(String[][] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 1;
            for (int j = 1; j < arr.length; j++) {
                if(arr[j-1][i].equals(arr[j][i])) {
                    temp++;
                }else {
                    if(cnt < temp) {
                        cnt = temp;
                    }

                    temp = 1;
                }
            }
            if(temp > cnt) {
                cnt = temp;
            }
        }

        return cnt;
    }
}
