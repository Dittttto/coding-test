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
                    swap(map, i, j-1, i, j);
                    int cnt = search(map);

                    if(totalCnt < cnt) {
                        totalCnt = cnt;
                    }

                    swap(map, i, j-1, i, j);
                }

                if(!map[j-1][i].equals(map[j][i])) {
                    swap(map, j-1, i, j, i);

                    int cnt = search(map);

                    if(totalCnt < cnt) {
                        totalCnt = cnt;
                    }
                    swap(map, j-1, i, j, i);
                }
            }
        }

        System.out.println(totalCnt);
    }

    static void swap(String[][] arr, int i1, int j1, int i2, int j2) {
        String temp = arr[i1][j1];
        arr[i1][j1] = arr[i2][j2];
        arr[i2][j2] = temp;
    }
    static int search(String[][] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            int rowTemp = 1;
            int columnTemp = 1;
            for (int j = 1; j < arr.length; j++) {
                if(arr[i][j-1].equals(arr[i][j])) {
                    rowTemp++;
                }else {
                    if(cnt < rowTemp) {
                        cnt = rowTemp;
                    }

                    rowTemp = 1;
                }

                if(arr[j-1][i].equals(arr[j][i])) {
                    columnTemp++;
                }else {
                    if(cnt < columnTemp) {
                        cnt = columnTemp;
                    }

                    columnTemp = 1;
                }
            }

            temp = Math.max(rowTemp, columnTemp);
            if(temp > cnt) {
                cnt = temp;
            }
        }
        return cnt;
    }
}
