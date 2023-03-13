import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];
        int sum = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        for(int num: numbers) {
            if(max < num) {
                max = num;
            }

            sum += num;
        }

        System.out.println(sum * 100.0 / max / N);
    }
}
