import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i += 4) {
            sb.append("long ");
        }

        sb.append("int");
        System.out.println(sb);
    }
}
