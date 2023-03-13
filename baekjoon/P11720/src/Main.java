import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String num  = sc.next();
        char[] cNum = num.toCharArray();
        int sum = 0;
        for(char c: cNum) {
            sum += c - '0';
        }

        System.out.println(sum);
    }
}
