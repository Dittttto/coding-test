import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<String[]> list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());

        while(n-- > 0) {
            String[] tmp = reader.readLine().split(" ");
            list.add(tmp);
        }

        list.sort((x, y) -> Integer.parseInt(x[0]) - Integer.parseInt(y[0]));

        for(String[] row: list) {
            writer.write(row[0] +" " +row[1] + "\n");
        }

        writer.flush();
        writer.close();
    }
}
