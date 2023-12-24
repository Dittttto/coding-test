import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// 핵심 아이디어
// isReverse 와 인덱스를 통해 배열을 자른다

public class Main {
        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        public static void main(String[] args) throws IOException {
                int n = Integer.parseInt(reader.readLine());
                for (int i = 0; i <n ; i++) {
                        String[] input = reader.readLine().split(" ");
                        writer.write(Integer.parseInt(input[0]) + Integer.parseInt(input[1]) + "\n");
                }
                writer.flush();
                writer.close();
        }
}
