import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(srt.nextToken());
        long M = Integer.parseInt(srt.nextToken());
        ArrayList<Long> list = new ArrayList<>();
        long left = 1;
        long right = Long.MIN_VALUE;

        for(String num: reader.readLine().split(" ")){
            long srtToNum = Long.parseLong(num);
            list.add(srtToNum);
            if(srtToNum > right) {
                right = srtToNum;
            }
        }
        long result = 0;
        while (left <= right) {
            long cnt = 0;
            long mid = left + (right - left) / 2;
            for (long num: list) {
                if(num < mid) continue;
                cnt += num - mid;
            }

            if(cnt >= M) {
                if(mid > result) {
                    result = mid;
                }else {
                    break;
                }
            }

            if(cnt > M) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }

        writer.write(result + "");
        writer.flush();
        writer.close();
    }
}
