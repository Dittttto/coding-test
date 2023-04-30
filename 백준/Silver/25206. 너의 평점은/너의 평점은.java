import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Double> score = new HashMap<>(){{
            put("A+", 4.5);
            put("A0", 4.0);
            put("B+", 3.5);
            put("B0", 3.0);
            put("C+", 2.5);
            put("C0", 2.0);
            put("D+", 1.5);
            put("D0", 1.0);
            put("F", 0.0);
        }};

        double sum = 0;
        double dim =0;
        for (int i = 0; i < 20; i++) {
            String[] tmp = reader.readLine().split(" ");
            double point = Double.parseDouble(tmp[1]);
            String s = tmp[2];
            if(score.get(s)!= null) {
                sum += point * score.get(s);
                dim += point;
            }
        }

        System.out.println(sum / dim);
    }
}
