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
                int n = Integer.parseInt(reader.readLine());

                for (int i = 0; i < n; i++) {
                        Map<String, Integer> wordA = new HashMap<>();
                        Map<String, Integer> wordB = new HashMap<>();
                        String[] input = reader.readLine().split(" ");
                        String A = input[0];
                        String B = input[1];

                        if (A.equals(B)) {
                                writer.write("Possible\n");
                                continue;
                        }

                        if(A.length() != B.length()) {
                                writer.write("Impossible\n");
                                continue;
                        }

                        for (String s : A.split("")) {
                                wordA.put(s, wordA.getOrDefault(s, 0) + 1);
                        }

                        for (String s : B.split("")) {
                                wordB.put(s, wordB.getOrDefault(s, 0) + 1);
                        }

                        boolean flag = true;
                        for (String s : wordA.keySet()) {
                                if (!wordB.containsKey(s)) {
                                        writer.write("Impossible\n");
                                        flag = false;
                                        break;
                                }
                                int numA = wordA.get(s);
                                int numB = wordB.get(s);

                                if (numA != numB) {
                                        writer.write("Impossible\n");
                                        flag = false;
                                        break;
                                }
                        }

                        if (flag){
                                writer.write("Possible\n");
                        }
                }

                writer.flush();
                writer.close();
        }
}
