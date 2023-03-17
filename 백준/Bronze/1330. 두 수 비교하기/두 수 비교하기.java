import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt = new StringTokenizer(reader.readLine());
        int A = Integer.parseInt(srt.nextToken());
        int B = Integer.parseInt(srt.nextToken());

        if(A > B) {
            System.out.println(">");
        }else if (A < B) {
            System.out.println("<");
        }else {
            System.out.println("==");
        }
    }
}
