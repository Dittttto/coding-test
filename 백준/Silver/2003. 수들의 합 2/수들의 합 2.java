import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution2003 {
    static int N;
    static int M;
    static int[] arr;
    public Solution2003() {}

    public void read() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        N = Integer.parseInt(srt.nextToken());
        M = Integer.parseInt(srt.nextToken());
        arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    public int run() {
        int l = 0;
        int r = 0;
        int cnt = 0;
        int tmp = arr[l];
        while(r < N) {
            if(tmp == M) {
                r++;
                cnt++;
                if (r >= N) break;
                tmp += arr[r];
            }else if(tmp < M) {
                r++;
                if (r >= N) break;
                tmp += arr[r];
            }else {
                tmp -= arr[l];
                l++;
            }
        }

        return cnt;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Solution2003 solution2003 = new Solution2003();
        solution2003.read();
        System.out.println(solution2003.run());
    }
}
