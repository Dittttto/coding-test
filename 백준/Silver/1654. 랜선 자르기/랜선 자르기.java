import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(srt.nextToken());
        int M = Integer.parseInt(srt.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        long left = 1;
        long right = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(reader.readLine());
            list.add(num);
            if(num > right) right = num;
        }

        long result = 0;
        while (left <= right) {
            int cnt = 0;
            long mid = left + (right - left) / 2;
            for (int num: list) {
                cnt += num / mid;
            }
            if(cnt >= M) {
                if(mid > result) {
                    result = mid;
                }
            }

            if(cnt >= M) {
                left = mid+1;
            }else {
                right = mid -1;
            }
        }
		
        System.out.println(result);
    }
}
