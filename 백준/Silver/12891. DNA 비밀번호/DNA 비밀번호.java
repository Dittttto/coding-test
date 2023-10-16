import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nums = reader.readLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);
        String[] dna = reader.readLine().split("");
        int[] rule = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] init = new int[4];
        int cnt = 0;
        int left =0;
        int right = left + m - 1;

        for (int i = 0; i < m; i++) {
            int idx = getIdx(dna[i]);
            init[idx] += 1;
        }

        cnt += check(init, rule);

        while(right < n) {
            init[getIdx(dna[left])] -= 1;
            left += 1;
            right += 1;
            if (right >= n) break;
            init[getIdx(dna[right])] += 1;
            cnt += check(init, rule);
        }


        writer.write(cnt + "");
        writer.flush();
        writer.close();
    }

    private static int getIdx(String word) {
        switch (word) {
            case "A":
                return 0;
            case "C":
                return 1;
            case "G":
                return 2;
            default:
                return 3;
        }
    }

    private static int check(int[] init, int[] rule) {
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            if (init[i] >= rule[i]) cnt += 1;
        }

        return  cnt == 4 ? 1 : 0;
    }
}
