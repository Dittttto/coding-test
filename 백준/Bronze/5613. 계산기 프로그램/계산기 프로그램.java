import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = Integer.parseInt(reader.readLine());
        String token = reader.readLine();
        while (!token.equals("=")) {
            switch (token) {
                case "+":
                    result += Integer.parseInt(reader.readLine());
                    break;
                case "-":
                    result -=Integer.parseInt(reader.readLine());
                    break;
                case "/":
                    result /= Integer.parseInt(reader.readLine());
                    break;
                case "*":
                    result *= Integer.parseInt(reader.readLine());
                    break;
            }

            token = reader.readLine();
        }

        System.out.println(result);
    }
}
