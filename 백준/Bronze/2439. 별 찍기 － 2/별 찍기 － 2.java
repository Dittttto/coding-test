import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= N ; i++) {
            String line = "";
            for (int j = i+1; j <=N; j++) {
                line += " ";
            }
            for (int j = 0; j < i; j++) {
                line += "*";
            }
            System.out.println(line);
        }

    }
}