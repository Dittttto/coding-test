import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Set<String> list = new HashSet<>();

        int cnt = 0;
        for (int i = 0; i < n ; i++) {
            String key = reader.readLine();

            if (key.equals("ENTER")) {
                list = new HashSet<>();
            }else {
                if (!list.contains(key)) {
                    cnt += 1;
                    list.add(key);
                }
            }
        }

        System.out.println(cnt);
    }
}
