import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());

        System.out.println(solve(a));
    }
    static int solve(int a) {
        if(a < 2
        ) {
            return 1;
        }

        return a * solve(a-1);
    }
}
