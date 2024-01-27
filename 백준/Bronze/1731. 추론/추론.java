import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(reader.readLine());

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        long result = 0L;
        if((numbers.get(1) / (double)numbers.get(0)) % 1 == 0) {
            int Q = numbers.get(1) / numbers.get(0);
            result = (long) (numbers.get(0) * Math.pow(Q, T));
        }else {
            int Q = numbers.get(1) - numbers.get(0);
            result = numbers.get(0) + (Q * T);
        }

        writer.write(result + "");
        writer.flush();
        writer.close();
    }
}
