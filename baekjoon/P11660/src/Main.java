import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N+1][N+1];
        for (int i = 0; i < N; i++) {
            String[] temp = sc.next().split(" ");
            System.out.println(Arrays.toString(temp));
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(temp[j]);
            }
        }

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        int[][] S = new int[N+1][N+1];

        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < N+1; j++) {
                S[i][j] = arr[i][j] + arr[i][j-1];
            }
        }

        System.out.println(Arrays.toString(S[0]));
        System.out.println(Arrays.toString(S[1]));
    }
}
