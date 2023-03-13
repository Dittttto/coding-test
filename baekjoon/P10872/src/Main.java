import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int result = 1;

        if( a < 2) {
            System.out.println(1);
            return;
        }

        for (int i = 2; i <= a; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
