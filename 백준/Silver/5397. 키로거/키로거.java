import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

public class Main {

        public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
                int n = Integer.parseInt(reader.readLine());
                List<Character> pw;
                for (int i = 0; i < n; i++) {
                         pw = new LinkedList<>();
                        int idx = 0;

                        for (Character s : reader.readLine().toCharArray()) {
                                if(s == '-'){
                                        if (idx > 0) {
                                                idx -= 1;
                                                pw.remove(idx);
                                        }
                                }else if(s == '<') {
                                        if (idx > 0) {
                                                idx -= 1;
                                        }
                                }else if(s == '>') {
                                        if (idx + 1 <= pw.size()) {
                                                idx += 1;
                                        }
                                }else {
                                        pw.add(idx, s);
                                        idx += 1;
                                }
                        }


                        StringBuilder sb = new StringBuilder();
                        for (Character s : pw) {
                                sb.append(s);
                        }
                        writer.write(sb + "\n");
                }

                writer.flush();
                writer.close();
        }
}
