import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution1182 {
    int N;
    int S;
    int[] arr;
    public Solution1182() {}
    public void read() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        N = Integer.parseInt(srt.nextToken());
        S = Integer.parseInt(srt.nextToken());
        arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    public int run() {
        int result = 0;
        for (int i = 1; i < (1<<N); i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                if((i & (1<<j)) > 0) {
                    sum += arr[j];
                }
            }

            if(sum == S) {
                result++;
            }
        }

        return result;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        Solution1182 solution1182 = new Solution1182();
        solution1182.read();
        System.out.println(solution1182.run());
    }
}
