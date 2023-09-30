import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numA = Integer.parseInt(reader.readLine());
        String[] b = reader.readLine().split("");

        int result = 0;
        for (int i = 2; i > -1;i--) {
            System.out.println(numA * Integer.parseInt(b[i]));
            result += numA * Integer.parseInt(b[i]) * Math.pow(10, 2 -i);
        }

        System.out.println(result);
    }
}
