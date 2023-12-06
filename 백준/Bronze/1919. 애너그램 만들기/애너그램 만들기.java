import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

        public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
                String A = reader.readLine();
                String B = reader.readLine();
                Map<String, Integer> wordA = new HashMap<>();
                Map<String, Integer> wordB = new HashMap<>();

                for (String s : A.split("")) {
                        wordA.put(s, wordA.getOrDefault(s, 0) + 1);
                }

                for (String s : B.split("")) {
                        wordB.put(s, wordB.getOrDefault(s, 0) + 1);
                }


                Map<String, Integer> shortW = A.length() > B.length() ? wordB : wordA;
                int cnt = 0;
                for (String s : shortW.keySet()) {

                       int numA = wordA.getOrDefault(s, 0);
                       int numB = wordB.getOrDefault(s, 0);
                       cnt += Math.min(numA, numB);
                }

                writer.write(A.length() + B.length() - cnt*2 + "");


                writer.flush();
                writer.close();
        }
}
