import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(reader.readLine());
        Long result = 0L;
        for(long i = n-1; i > 0; i--){
            result += i;
        }
        System.out.println(result);
        System.out.println(2);
    }
}