import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = Math.max(input[1] - input[0] -1, input[2]- input[1] - 1);
        writer.write(String.valueOf(result));
        writer.flush();
        writer.close();
    }
}
    