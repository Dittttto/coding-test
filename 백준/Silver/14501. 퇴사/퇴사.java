import java.io.*;
import java.util.Arrays;

public class Main {
    static int result = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] pArr = new int[N];
        int[] tArr = new int[N];

        for (int i = 0; i < N; i++) {
            int[] input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            tArr[i] = input[0];
            pArr[i] = input[1];
        }
        calc(N, pArr, tArr, 0, 0);
        System.out.println(result);
    }

    public static void calc(int N,int[] pArr,int[] tArr, int i, int sum) {
        if (i == N){
            result = Math.max(result, sum);
            return;
        }

        if(i  > N) return;
        calc(N, pArr, tArr, i + tArr[i], sum + pArr[i]);
        calc(N, pArr, tArr, i + 1, sum);
    }
}
