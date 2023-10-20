import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static BufferedWriter writer;
    static int length;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        writer = new BufferedWriter(new OutputStreamWriter(System.out));
        length = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        dfs(sb);
        writer.flush();
        writer.close();
    }

    public static void dfs(StringBuilder sb) throws IOException {
        if (length == sb.length()) {
            writer.write(sb + "\n");
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (sb.length() == 0 && i == 1) {
                continue;
            }
            if (check(sb.toString() + i)) {
                dfs(sb.append(i));
                sb.delete(sb.length() - 1, sb.length());
            }
        }
    }

    public static boolean check(String s) {
        int num = Integer.parseInt(s);
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
