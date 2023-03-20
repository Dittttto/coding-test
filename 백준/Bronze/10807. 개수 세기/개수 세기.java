import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        HashMap<Integer, Integer> hm = new HashMap<>();
        String[] arr = reader.readLine().split(" ");
        int find = Integer.parseInt(reader.readLine());

        for(String num: arr) {
            int key = Integer.parseInt(num);
            if(hm.containsKey(key)) {
                hm.replace(key,hm.get(key)+1);
            }else {
                hm.put(key, 1);
            }
        }

        if(!hm.containsKey(find)) {
            System.out.println(0);
            return;
        }

        System.out.println(hm.get(find));
    }
}
