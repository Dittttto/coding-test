import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        public static void main(String[] args) throws IOException {
                int n = Integer.parseInt(reader.readLine());
                for (int i = 2; i < 10; i++) {
                        if(checkPrimeNumber(i)) {
                                dfs(i, 1, n);
                        }
                }
                writer.flush();
                writer.close();
        }

        private static void dfs(int c, int length, int limit) throws IOException {
                if (length == limit) {
                        writer.write(c+"\n");
                        return;
                }

                for (int i = 1; i< 10;i++) {
                        int number = c * 10 + i;
                        if(checkPrimeNumber(number)) {
                                dfs(number, length+1, limit);
                        }
                }
        }

        private static boolean checkPrimeNumber(int num) {
                for(int i = 2; i <= num / 2; i++) {
                        if(num % i == 0) {
                                return false;
                        }
                }

                return true;
        }
}
