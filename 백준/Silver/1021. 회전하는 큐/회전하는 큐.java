import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(srt.nextToken());
        int M = Integer.parseInt(srt.nextToken());
        int[] arr = new int[M];
        int queueSize = N;

        srt = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(srt.nextToken());
        }

        int idx = 0;
        int cnt = 0;
        while(idx < M) {
            int findNum = arr[idx] - 1;
            int acc = 0;

            if(findNum <= queueSize / 2) {
                cnt += findNum;
                acc += findNum * -1;
            }else {
                cnt += queueSize - findNum;
                acc += queueSize - findNum;
            }

            for (int i = 0; i < arr.length; i++) {

                arr[i] = (arr[i] + acc + queueSize -1)% queueSize;
            }

            queueSize -= 1;
            idx +=1;
        }

        System.out.println(cnt);
    }
}
