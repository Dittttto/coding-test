import java.io.*;
import java.util.Arrays;

public class Main {
    static boolean[] ban = new boolean[10];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        if(N == 100) {            
            writer.write(0 +"");
            writer.flush();
            writer.close();
            return;
        }

        if(M == 0) {
            int len = getLen(N);
            int temp = Math.abs(N - 100);

            writer.write(Math.min(len, temp) +"");
        }else if (M == 10) {
            writer.write(Math.abs(N - 100) +"");
        }else {
            for(String item: reader.readLine().split(" ")) {
                ban[Integer.parseInt(item)] = true;
            }

            if(possible(N)) {
                writer.write(Math.min(Math.abs(N - 100), getLen(N)) + "");
            }else {
                int findMin = Math.min(Math.abs(N - 100), findNearNum(N));
                writer.write(findMin + "");
            }
        }
        writer.flush();
        writer.close();

    }

    public static int findNearNum(int N) {
        int left = N <= 0 ? 0 :N-1;
        int right = N+1;
        int leftDiff = N;
        int rightDiff = N;

        boolean findLeft = false;
        boolean findRight = false;

        while(true) {
            if(possible(left)) {
                leftDiff = N - left;
                findLeft = true;
            }

            if(possible(right)) {
                rightDiff = right - N;
                findRight = true;
            }
            if(findRight && findLeft) {
                return Math.min(leftDiff + getLen(left), rightDiff + getLen(right));
            } else if(findLeft && !findRight) {
                return leftDiff + getLen(left);
            }else if(!findLeft && findRight) {
                return rightDiff + getLen(right);
            }else {
                left = Math.max(left-1, 0);
                right++;
            }

        }
    }

    public static boolean possible(int n){
        boolean isPossible = true;

        if(n == 0) {
            return !ban[0];
        }

        while(n > 0) {
            int mod = n%10;
            if(ban[mod]){
                isPossible = false;
                break;
            }
            n/=10;
        }
        return isPossible;
    }

    public static int getLen(int n) {
        if(n == 0) {
            return 1;
        }
        int len = 0;

        while(n > 0) {
            n /=10;
            len++;
        }

        return len;
    }
}
