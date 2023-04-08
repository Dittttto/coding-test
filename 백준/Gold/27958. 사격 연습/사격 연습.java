import java.util.*;
import java.io.*;

class Solution27958 {
    int[][] board;
    int[] bullets;
    int n;
    int k;
    int result = Integer.MIN_VALUE;
    boolean[] noPoints;

    public Solution27958() {
    }

    public void read() throws IOException {
        BufferedReader reader = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        this.n = Integer.parseInt(reader.readLine());
        this.k = Integer.parseInt(reader.readLine());
        this.board = new int[n][];
        this.noPoints = new boolean[n];
        for (int i = 0; i < n; i++) {
            board[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        this.bullets = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    public int run() {
        permutation(new int[k], 0);
        return result;
    }

    public void output() throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(run() + "");
        writer.flush();
        writer.close();
    }

    public void permutation(int[] out, int depth) {
        if (depth == k) {
            result = Math.max(result, shot(out));
            return;
        }

        for (int i = 0; i < n; i++) {
            out[depth] = i;
            permutation(out, depth + 1);
        }

    }

    public int[][] copyBoard() {
        int[][] tmp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tmp[i][j] = board[i][j];
            }
        }
        return tmp;
    }

    public int shot(int[] row) {
        int score = 0;
        int[][] map = copyBoard();
        int[][] map2 = copyBoard();
        for (int i = 0; i< row.length;i++) {
            int rowIdx = row[i];
            int[] line = map[row[i]];
            int strength = bullets[i];
            for (int l = 0; l < line.length; l++) {
                if (map[rowIdx][l] == 0) continue;
                if (map[rowIdx][l] >= 10) {
                    score += map[rowIdx][l];
                    map[rowIdx][l] = 0;
                } else {
                    if (map[rowIdx][l] > strength) {
                        map[rowIdx][l] -= strength;
                    } else {
                        score += map2[rowIdx][l];
                        if (l - 1 >= 0 && line[l - 1] == 0) {
                            map[row[i]][l-1] = map[rowIdx][l] / 4;
                            map2[row[i]][l-1] = map[rowIdx][l] / 4;
                        }
                        if (l + 1 < line.length && line[l + 1] == 0) {
                            map[row[i]][l+1] = map[rowIdx][l] / 4;
                            map2[row[i]][l+1] = map[rowIdx][l] / 4;
                        }

                        if(row[i] -1 >= 0 && map[row[i] -1][l] == 0) {
                            map[row[i] -1][l] = map[rowIdx][l] / 4;
                            map2[row[i] -1][l] = map[rowIdx][l] / 4;
                        }

                        if(row[i] +1 < map.length && map[row[i] +1][l] == 0) {
                            map[row[i] +1][l] = map[rowIdx][l] / 4;
                            map2[row[i] +1][l] = map[rowIdx][l] / 4;
                        }

                        map[rowIdx][l] = 0;

                    }
                }

                break;
            }
        }
        return score;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Solution27958 solution = new Solution27958();
        solution.read();
        solution.output();
    }
}
