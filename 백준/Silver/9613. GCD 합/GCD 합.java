import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        StringTokenizer srt;

        for (int i = 0; i < T; i++) {
            srt = new StringTokenizer(reader.readLine());
            int N = Integer.parseInt(srt.nextToken());
            int[] nums = new int[N];

            for (int j = 0; j < N; j++) {
                nums[j] = Integer.parseInt(srt.nextToken());
            }

            long result = 0L;
            for (int j = 0; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if(nums[j] == nums[k]) {
                        result += nums[j];
                    } else if(nums[j] < nums[k] && nums[k] % nums[j] == 0){
                        result += nums[j];
                    }else if (nums[k] < nums[j] && nums[j] % nums[k] == 0) {
                        result += nums[k];
                    }else {
                        result += getGcd(nums[j], nums[k]);
                    }
                }
            }

            System.out.println(result);
        }
    }

    static int getGcd(int a, int b) {
        if(b == 0) {
            return a;
        }

        return getGcd(b, a%b);
    }
}
