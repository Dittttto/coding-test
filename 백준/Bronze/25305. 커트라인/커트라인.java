import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(srt.nextToken());
        int k = Integer.parseInt(srt.nextToken());
        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        System.out.println(arr[n-k]);
    }
}
