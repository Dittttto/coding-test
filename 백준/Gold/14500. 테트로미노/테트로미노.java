import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(srt.nextToken());
        int M = Integer.parseInt(srt.nextToken());
        
        int[][] map = new int[N][M];

        for (int i = 0; i < N ; i++) {
            srt = new StringTokenizer(reader.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(srt.nextToken());
            }
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(j+3 <= M-1) {
                    int temp = map[i][j] + map[i][j+1] + map[i][j+2]+ map[i][j+3];
                    result = Math.max(result, temp);
                }

                if(j+1 <=M-1 && i+2 <= N-1) {
                    int temp = map[i][j] + map[i+1][j] + map[i+2][j] + map[i+2][j+1];
                    result = Math.max(result, temp);
                }

                if(i+1 <= N-1 && j +1 <= M-1) {
                    int temp = map[i][j] + map[i+1][j] + map[i][j+1] + map[i+1][j+1];
                    result = Math.max(result, temp);
                }

                if(j+2 <= M-1 && i+1 <=N-1 ){
                    int temp = map[i][j] + map[i][j+1] + map[i+1][j+1] + map[i][j+2];
                    result = Math.max(result, temp);
                }

                if(j+1 <= M-1 && i+2 <= N-1) {
                    int temp = map[i][j]+map[i+1][j] + map[i+1][j+1] + map[i+2][j+1];
                    result = Math.max(result, temp);
                }

                if(i+3 <= N-1) {
                    int temp = map[i][j] + map[i+1][j] + map[i+2][j]+ map[i+3][j];
                    result = Math.max(result, temp);
                }

                if(i+1 <= N-1 && j+2 <=M-1) {
                    int temp = map[i+1][j]+map[i+1][j+1]+map[i][j+1]+map[i+1][j+2];
                    result = Math.max(result, temp);
                }

                if(i+2 <= N-1 && j-1 >=0) {
                    int temp = map[i+1][j-1]+map[i][j]+map[i+1][j]+map[i+2][j];
                    result = Math.max(result, temp);
                }

                if(i+2 <= N-1 && j+1 <= M-1) {
                    int temp = map[i+1][j+1]+map[i][j]+map[i+1][j]+map[i+2][j];
                    result = Math.max(result, temp);
                }

                if(i+2 <= N-1 && j-1 >= 0) {
                    int temp = map[i+2][j-1]+map[i][j]+map[i+1][j]+map[i+2][j];
                    result = Math.max(result, temp);
                }

                if(i+1 <= N-1 && j+2 <= M-1) {
                    int temp = map[i+1][j]+map[i+1][j+1]+map[i+1][j+2]+map[i][j+2];
                    result = Math.max(result, temp);
                }
                if(i+2 <= N-1 && j+1 <= M-1) {
                    int temp = map[i][j]+map[i][j+1]+map[i+1][j+1]+map[i+2][j+1];
                    result = Math.max(result, temp);
                }
                if(i+1 <= N-1 && j+2 <= M-1) {
                    int temp = map[i][j]+map[i][j+1]+map[i+1][j]+map[i][j+2];
                    result = Math.max(result, temp);
                }
                if(i+1 <= N-1 && j+2 <= M-1) {
                    int temp = map[i+1][j]+map[i+1][j+1]+map[i][j]+map[i+1][j+2];
                    result = Math.max(result, temp);
                }
                if(i+2 <= N-1 && j+1 <= M-1) {
                    int temp = map[i][j]+map[i][j+1]+map[i+1][j]+map[i+2][j];
                    result = Math.max(result, temp);
                }
                if(i+1 <= N-1 && j+2 <= M-1) {
                    int temp = map[i][j]+map[i][j+1]+map[i][j+2]+map[i+1][j+2];
                    result = Math.max(result, temp);
                }

                if(i+1 <= N-1 && j+2 <= M-1) {
                    int temp = map[i+1][j]+map[i][j+1]+map[i][j+2]+map[i+1][j+1];
                    result = Math.max(result, temp);
                }

                if(i+2 <= N-1 && j+1 <= M-1) {
                    int temp = map[i+1][j]+map[i+2][j]+map[i][j+1]+map[i+1][j+1];
                    result = Math.max(result, temp);
                }

                if(i+1 <= N-1 && j+2 <= M-1) {
                    int temp = map[i][j]+map[i][j+1]+map[i+1][j+1]+map[i+1][j+2];
                    result = Math.max(result, temp);
                }

            }
        }

        System.out.println(result);
    }
}
