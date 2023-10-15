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

        for (int i = 0; i < n ; i++) {
            String[] input = reader.readLine().split(" ");

            String a = input[0];
            String b = input[1];

            if (a.equals("ChongChong") || b.equals("ChongChong")){
                list.add(a);
                list.add(b);
            }

            if (list.contains(a)) {
                list.add(b);
            }

            if (list.contains(b)) {
                list.add(a);
            }
        }

        System.out.println(list.size());
    }
}
