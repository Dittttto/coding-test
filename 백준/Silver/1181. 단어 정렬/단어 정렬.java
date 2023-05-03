import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(reader.readLine());
        }

        ArrayList<String> list = new ArrayList<>(set);
        list.sort((x, y) -> {
            if(x.length() == y.length()) {
                return x.compareTo(y);
            }else {
                return x.length() - y.length();
            }
        });

        for(String str: list) {
            writer.write(str + "\n");
        }

        writer.flush();
        writer.close();
    }
}
