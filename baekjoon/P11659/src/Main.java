import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] nums = new int[N];
        int[] S = new int[N];
        int[][] arr = new int[M][];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
            if(i != 0) {
                S[i] = S[i-1] + nums[i];
            }else {
                S[0] = nums[0];
            }
        }

        for (int i = 0; i < M; i++) {
            int s = sc.nextInt() - 1;
            int e = sc.nextInt() - 1;
            arr[i] = new int[]{s, e};
        }

        for(int[] item: arr) {
            if(item[0]- 1< 0) {
                System.out.println(S[item[1]]);
                continue;
            }

            System.out.println(S[item[1]] - S[item[0]-1]);
        }

    }
}
