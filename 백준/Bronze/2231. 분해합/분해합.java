import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        boolean find = false;
        int result = 0;
        for (int i = 1; i <= N; i++) {
            int tmp = i;
            int tmp2 = i;
            while(tmp2 > 0) {
                tmp += tmp2 % 10;
                tmp2 /= 10;
            }

            if(tmp == N) {
                find = true;
                result = i;
                break;
            }
        }

        if(find) {
            System.out.println(result);
        }else {
            System.out.println(0);
        }
    }
}
