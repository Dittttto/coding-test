import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        int result = 0;

        for (int i = 0; i < T; i++) {
            String[] list = reader.readLine().split("");
            HashMap<String, Boolean> hm = new HashMap<>();
            String prev = "";
            boolean isGroup = true;

            for(String chr: list) {
                if(!hm.containsKey(chr)){
                    hm.put(chr, false);
                }
            }

            for(String chr: list) {
                if(prev.equals("")){
                    hm.replace(chr, true);
                    prev = chr;
                    continue;
                }

                if(!prev.equals(chr)){
                    if(hm.get(chr)) {
                        isGroup = false;
                        break;
                    }

                    hm.replace(chr, true);
                    prev = chr;
                }
            }

            if(isGroup) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}
