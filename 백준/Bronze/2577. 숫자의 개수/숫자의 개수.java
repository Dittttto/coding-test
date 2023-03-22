import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(reader.readLine());
        int B = Integer.parseInt(reader.readLine());
        int C = Integer.parseInt(reader.readLine());

        long multiple = (long) A * B * C;
        String value = String.valueOf(multiple);
        String[] arr = value.split("");

        int[] count = new int[10];
        for(String num: arr) {
            count[Integer.parseInt(num)] += 1;
        }

        for (int idx: count) {
            System.out.println(idx);
        }
    }
}