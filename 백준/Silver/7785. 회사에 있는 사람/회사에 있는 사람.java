import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer srt;
        int n = Integer.parseInt(reader.readLine());
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String input = reader.readLine();
            srt = new StringTokenizer(input);

            String who = srt.nextToken();
            String state = srt.nextToken();

            if (state.equals("enter")) {
                map.put(who, state);
            } else {
                map.remove(who);
            }

        }

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        Collections.reverse(list);


        for (String item : list) {
            System.out.println(item);
        }
    }
}
