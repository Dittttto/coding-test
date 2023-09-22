import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(reader.readLine());


        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(reader.readLine());
            List<int[]> memo = new ArrayList<>();
            memo.add(new int[]{1, 0});
            memo.add(new int[]{0, 1});
            for (int j = 2; j <= n; j++) {
                int[] preT = memo.get(j - 2);
                int[] preO = memo.get(j - 1);

                int[] newValue = new int[]{(preT[0] + preO[0]), (preT[1] + preO[1])};
                memo.add(newValue);
            }

            writer.write(memo.get(n)[0] + " " + memo.get(n)[1] + "\n");
        }

        writer.flush();
        writer.close();
    }
}
